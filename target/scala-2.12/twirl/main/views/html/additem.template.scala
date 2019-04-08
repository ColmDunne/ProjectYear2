
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object additem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.ItemOnSale],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.ItemOnSale], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Item", user)/*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*11.137*/ {_display_(Seq[Any](format.raw/*11.139*/("""
        """),format.raw/*12.37*/("""
        """),format.raw/*13.99*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""

        """),format.raw/*16.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*20.24*/select),format.raw/*20.30*/(""" """),format.raw/*20.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*23.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*23.86*/("""
            """),_display_(/*24.14*/select(
                itemForm("category.id"),
                options(Category.options),
                '_label -> "Category", '_default -> "-- Choose a category --", 
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*29.14*/("""
            """),_display_(/*30.14*/inputText(itemForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*30.100*/("""
            """),_display_(/*31.14*/inputText(itemForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*31.88*/("""
            """),_display_(/*32.14*/inputText(itemForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*32.88*/("""

            """),_display_(/*34.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*34.75*/("""

            """),format.raw/*36.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <label>Image Upload</label>
               <input class="btn-sm btn-default" type="file" name="upload">
               <br>
               <br>

            <div class="actions">
                <input type="submit" value="Add/Update item" class="btn btn-primary">
                <a href=""""),_display_(/*47.27*/routes/*47.33*/.HomeController.onsale(0)),format.raw/*47.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
            
               

    """)))}),format.raw/*54.6*/(""" """),format.raw/*54.24*/("""
""")))}),format.raw/*55.2*/(""" """),format.raw/*55.20*/("""

"""))
      }
    }
  }

  def render(itemForm:Form[models.ItemOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.ItemOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 08 14:16:40 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/additem.scala.html
                  HASH: 6ec770eebf1549e4af918661361cd4fb8e439ab0
                  MATRIX: 985->1|1118->64|1162->62|1189->80|1216->82|1246->104|1284->105|1315->110|1634->403|1775->534|1816->536|1853->573|1890->672|1927->682|1940->686|1971->696|2008->706|2382->1053|2409->1059|2438->1060|2690->1285|2783->1357|2824->1371|3099->1625|3140->1639|3248->1725|3289->1739|3384->1813|3425->1827|3520->1901|3562->1916|3644->1977|3686->1991|4235->2513|4250->2519|4296->2544|4486->2704|4515->2722|4547->2724|4576->2742
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|47->16|51->20|51->20|51->20|54->23|54->23|55->24|60->29|61->30|61->30|62->31|62->31|63->32|63->32|65->34|65->34|67->36|78->47|78->47|78->47|85->54|85->54|86->55|86->55
                  -- GENERATED --
              */
          