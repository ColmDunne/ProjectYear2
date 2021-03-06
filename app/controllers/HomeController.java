package controllers;

import play.mvc.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import play.Logger;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import java.io.File;
import models.*;
import models.users.*;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import views.html.*;





/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment e;
    @Inject
    public HomeController(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e=env;
    }

    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    public Result onsale(Long cat) {
        
        List<ItemOnSale> itemList = null;
        List<Category> categoryList = Category.findAll();

        if (cat == 0) {
            itemList = ItemOnSale.findAll();
        } else {
            itemList = Category.find.ref(cat).getItems();
        }
        return ok(onsale.render(itemList, categoryList, User.getUserById(session().get("email")),e));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addItem() {
        Form<ItemOnSale> itemForm = formFactory.form(ItemOnSale.class);
        return ok(additem.render(itemForm, User.getUserById(session().get("email"))));
    }

    public Result about() {
        return ok(about.render(User.getUserById(session().get("email"))));
    }
    

/* old - no update
    public Result addItemSubmit() {
        // We use the method bindFromRequest() to populate our Form<ItemOnSale> object with the
        // data that the user submitted. Thanks to Play Framework, we do not need to do the messy
        // work of parsing the request and extracting data from it characte by character.
        Form<ItemOnSale> newItemForm = formFactory.form(ItemOnSale.class).bindFromRequest();

        // We check for errors (based on constraints set in ItemOnSale class)
        if (newItemForm.hasErrors()) {
            // If the form data have errors, we call the method badRequest(), requesting Play 
            // Framework to send an error response to the user and display the additem page again. 
            // As we are passing in newItemForm, the form will be populated with the data that the 
            // user has already entered, saving them from having to enter it all over again.
            return badRequest(additem.render(newItemForm));
        } else {
            // If no errors are found in the form data, we extract the data from the form.
            // Form objects have handy utility methods, such as the get() method we are using 
            // here to extract the data into an ItemOnSale object. This is possible because
            // we defined the form in terms of the model class ItemOnSale.
            ItemOnSale newItem = newItemForm.get();

            // Now we call the ORM method save() on the model object, to have it saved in the
            // database as a line in the table item_on_sale.
            newItem.save();

            // We use the flash scope to specify that we want a success message superimposed on
            // the next displayed page. The flash scope uses cookies, which we can read and set
            // using the flash() function of the Play Framework. The flash scope cookies last
            // for a single request (unlike session cookies, which we will use for log-in in a
            // future lab). So, add a success message to the flash scope.
            flash("success", "Item " + newItem.getName() + " was added.");
            // Having specified we want a message at the top, we can redirect to the onsale page,
            // which will have to be modified to read the flash scope and display it.
            return redirect(controllers.routes.HomeController.onsale(0));
        }
    }
*/

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addItemSubmit() {
        String saveImageMsg;
        // We use the method bindFromRequest() to populate our Form<ItemOnSale> object with the
        // data that the user submitted. Thanks to Play Framework, we do not need to do the messy
        // work of parsing the request and extracting data from it character by character.
        Form<ItemOnSale> newItemForm = formFactory.form(ItemOnSale.class).bindFromRequest();
        
        // We check for errors (based on constraints set in ItemOnSale class)
        if (newItemForm.hasErrors()) {
            // If the form data have errors, we call the method badRequest(), requesting Play 
            // Framework to send an error response to the user and display the additem page again. 
            // As we are passing in newItemForm, the form will be populated with the data that the 
            // user has already entered, saving them from having to enter it all over again.
            return badRequest(additem.render(newItemForm, User.getUserById(session().get("email"))));
        } else {
            // If no errors are found in the form data, we extract the data from the form.
            // Form objects have handy utility methods, such as the get() method we are using 
            // here to extract the data into an ItemOnSale object. This is possible because
            // we defined the form in terms of the model class ItemOnSale.
            ItemOnSale newItem = newItemForm.get();
            
            
            
            // To include update functionality we check whether the item has an id value. If it
            // does, we are looking at an existing item and the right operation to perform is
            // 'update'. If not, the operation to perform is 'save'.
            if (newItem.getId() == null) {
                // We call the ORM method save() on the model object, to have it saved in the
                // database as a line in the table item_on_sale.
                newItem.save();
            } else {
                // We call the ORM method update() on the model object, to have it updated
                // in the database.
                newItem.update();
            }
            MultipartFormData data = request().body().asMultipartFormData();
            FilePart image = data.getFile("upload");

            saveImageMsg = saveFile(newItem.getId(),image);

    
            // We use the flash scope to specify that we want a success message superimposed on
            // the next displayed page. The flash scope uses cookies, which we can read and set
            // using the flash() function of the Play Framework. The flash scope cookies last
            // for a single request (unlike session cookies, which we will use for log-in in a
            // future lab). So, add a success message to the flash scope.
            flash("success", "Item " + newItem.getName() + " was added/updated.");
            // Having specified we want a message at the top, we can redirect to the onsale page,
            // which will have to be modified to read the flash scope and display it.
            return redirect(controllers.routes.HomeController.onsale(0));
        }
    }
        // Save an image file
        

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteItem(Long id) {

        // The following line of code finds the item object by id, then calls the delete() method
        // on it to have it removed from the database.
        ItemOnSale.find.ref(id).delete();

        // Now write to the flash scope, as we did for the successful item creation.
        flash("success", "Item has been deleted.");
        // And redirect to the onsale page
        return redirect(controllers.routes.HomeController.onsale(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result updateItem(Long id) {
        ItemOnSale i;
        Form<ItemOnSale> itemForm;

        try {
            // Find the item by id
            i = ItemOnSale.find.byId(id);

            // Populate the form object with data from the item found in the database
            itemForm = formFactory.form(ItemOnSale.class).fill(i);
        } catch (Exception ex) {
            return badRequest("error");
        }

        // Display the "add item" page, to allow the user to update the item
        return ok(additem.render(itemForm, User.getUserById(session().get("email"))));
    }
    public String saveFile(Long id, FilePart<File> image) {
        if (image != null) {
            // Get mimetype from image
            String mimeType = image.getContentType();
            // Check if uploaded file is an image
            if (mimeType.startsWith("image/")) {
                // Create file from uploaded image
                File file = image.getFile();
                // create ImageMagick command instance
                ConvertCmd cmd = new ConvertCmd();
                // create the operation, add images and operators/options
                IMOperation op = new IMOperation();
                // Get the uploaded image file
                op.addImage(file.getAbsolutePath());
                // Resize using height and width constraints
                op.resize(300,200);
                // Save the  image
                op.addImage("public/images/productImages/" + id + ".jpg");
                // thumbnail
                IMOperation thumb = new IMOperation();
                // Get the uploaded image file
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                // Save the  image
                thumb.addImage("public/images/productImages/Thumbnails/" + id + ".jpg");
                // execute the operation
                try{
                    cmd.run(op);
                    cmd.run(thumb);
                }
                catch(Exception e){
                    e.printStackTrace();
                }				
                return " and image saved";
            }
        }
        return "image file missing";	
    }
    
}
