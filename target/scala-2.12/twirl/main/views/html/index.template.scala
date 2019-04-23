
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Home", user)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
	"""),format.raw/*3.2*/("""<div class="col-sm-3">
		</div>
		<div class="col-sm-4">
		<div class="midcol">
				
				<img src="/assets/images/productImages/nike.jpg" alt="Nike" width="350" height="700"/>
	
	</div>
	</div>
	
		<div style="text-align:center;"class="col-sm-4" >
	<h1 >Welcome to C.C.A SportsWare!</h1>
	<h3>The place where you can buy the top sports clothing brands</h3>


	<div class="w3-container">
		<h2>New items available</h2>
		<p>These items are available while stocks last! </p>
	  </div>
	  
	  <div class="w3-content w3-display-container">
	  
	  <div class="w3-display-container mySlides">
		<img src="/assets/images/productImages/top1.jpg" style="width:80%">
		<div class="w3-display-bottomleft w3-large w3-container w3-padding-16 w3-black">
		Nike Athlete T-Shirt &euro; 30
		</div>
	  </div>
	  
	  <div class="w3-display-container mySlides">
		<img src="/assets/images/productImages/shorts1.jpg" style="width:90%">
		<div class="w3-display-bottomright w3-large w3-container w3-padding-16 w3-black">
			Under Armour Performance Shorts  &euro; 25
		</div>
	  </div>
	  
	  <div class="w3-display-container mySlides">
		<img src="/assets/images/productImages/leggings1.jpg" style="width:90%">
		<div class="w3-display-topleft w3-large w3-container w3-padding-16 w3-black">
			Nike Womens Leggings  &euro; 45
		</div>
	  </div>
	  
	  <div class="w3-display-container mySlides">
		<img src="/assets/images/productImages/hoodie1.jpg" style="width:100%">
		<div class="w3-display-topright w3-large w3-container w3-padding-16 w3-black">
		 Adidas Sport Hoodie  &euro; 50
		</div>
	  </div>
	  
	  <div class="w3-display-container mySlides">
		<img src="/assets/images/productImages/runners1.jpg" style="width:80%">
		<div class="w3-display-middle w3-large w3-container w3-padding-16 w3-black">
			Nike Air Max 270s  &euro; 150
		</div>
		</div>
		
		<div class="w3-display-container mySlides">
			<img src="/assets/images/productImages/jacket1.jpg" style="width:90%">
			<div class="w3-display-middle w3-large w3-container w3-padding-16 w3-black">
				Under Armour Windstopper Jacket  &euro; 185
			</div>
			</div>
	  
	  <button class="w3-button w3-display-left w3-black" onclick="plusDivs(-1)">&#10094;</button>
	  <button class="w3-button w3-display-right w3-black" onclick="plusDivs(1)">&#10095;</button>
	  
	  </div>
	  
	  <script>
	  var slideIndex = 1;
	  showDivs(slideIndex);
	  
	  function plusDivs(n) """),format.raw/*76.25*/("""{"""),format.raw/*76.26*/("""
		"""),format.raw/*77.3*/("""showDivs(slideIndex += n);
	  """),format.raw/*78.4*/("""}"""),format.raw/*78.5*/("""
	  
	  """),format.raw/*80.4*/("""function showDivs(n) """),format.raw/*80.25*/("""{"""),format.raw/*80.26*/("""
		"""),format.raw/*81.3*/("""var i;
		var x = document.getElementsByClassName("mySlides");
		if (n > x.length) """),format.raw/*83.21*/("""{"""),format.raw/*83.22*/("""slideIndex = 1"""),format.raw/*83.36*/("""}"""),format.raw/*83.37*/("""
		"""),format.raw/*84.3*/("""if (n < 1) """),format.raw/*84.14*/("""{"""),format.raw/*84.15*/("""slideIndex = x.length"""),format.raw/*84.36*/("""}"""),format.raw/*84.37*/("""
		"""),format.raw/*85.3*/("""for (i = 0; i < x.length; i++) """),format.raw/*85.34*/("""{"""),format.raw/*85.35*/("""
		   """),format.raw/*86.6*/("""x[i].style.display = "none";  
		"""),format.raw/*87.3*/("""}"""),format.raw/*87.4*/("""
		"""),format.raw/*88.3*/("""x[slideIndex-1].style.display = "block";  
	  """),format.raw/*89.4*/("""}"""),format.raw/*89.5*/("""
	  """),format.raw/*90.4*/("""</script>

</div>
</div>

</div>

		<div class="col-sm-4">
		<div class="midcol">
				<img src="https://i.pinimg.com/originals/91/84/5b/91845b732fbbb0ad01edefb8467a7e59.jpg" alt="Rory Mciroy" width="350" height="700">
	
	
	
	</div>
</div>
<div class="col-sm-8"></div>
</div>
""")))}),format.raw/*107.2*/("""

"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 14:20:55 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/index.scala.html
                  HASH: 4462d76c158c4315df9da92b6884f1eb2d1827be
                  MATRIX: 959->1|1079->26|1107->29|1133->47|1171->48|1200->51|3711->2534|3740->2535|3771->2539|3829->2570|3857->2571|3894->2581|3943->2602|3972->2603|4003->2607|4115->2691|4144->2692|4186->2706|4215->2707|4246->2711|4285->2722|4314->2723|4363->2744|4392->2745|4423->2749|4482->2780|4511->2781|4545->2788|4606->2822|4634->2823|4665->2827|4739->2874|4767->2875|4799->2880|5123->3173
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|108->76|108->76|109->77|110->78|110->78|112->80|112->80|112->80|113->81|115->83|115->83|115->83|115->83|116->84|116->84|116->84|116->84|116->84|117->85|117->85|117->85|118->86|119->87|119->87|120->88|121->89|121->89|122->90|139->107
                  -- GENERATED --
              */
          