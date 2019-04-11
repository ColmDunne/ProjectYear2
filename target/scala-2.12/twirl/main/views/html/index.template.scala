
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
				<img src="https://i.pinimg.com/originals/3a/f9/4f/3af94f5e4e58cb5cdf0509c4904825c8.jpg" alt="messi" width="300" height="600">
	
	
	</div>
	</div>
	
		<div style="text-align:center;"class="col-sm-4" >
	<h1 >Welcome to C.C.A SportsWare!</h1>
	<h3>The place where you can buy the top sports clothing brands</h3>


	<div class="w3-container">
		<h2>New shoes available</h2>
		<p>These shoes are a limited time offer! </p>
	  </div>
	  
	  <div class="w3-content w3-display-container">
	  
	  <div class="w3-display-container mySlides">
		<img src="https://www.technobuffalo.com/sites/technobuffalo.com/files/styles/large/public/wp/2019/01/1nike-adapt-bb.jpg" style="width:40%">
		<div class="w3-display-bottomleft w3-large w3-container w3-padding-16 w3-black">
		Nike's new Adapt BB £150
		</div>
	  </div>
	  
	  <div class="w3-display-container mySlides">
		<img src="https://cdn-images.farfetch-contents.com/13/19/70/13/13197013_14715715_1000.jpg" style="width:40%">
		<div class="w3-display-bottomright w3-large w3-container w3-padding-16 w3-black">
			BALENCIAGA Speed knitted sneakers £400
		</div>
	  </div>
	  
	  <div class="w3-display-container mySlides">
		<img src="https://static.mainlinemenswear.co.uk/shopimages/products/normal/0000%20a%20%20%20827%20007.jpg" style="width:40%">
		<div class="w3-display-topleft w3-large w3-container w3-padding-16 w3-black">
			BOSS Athleisure Spacit Trainers Black £80
		</div>
	  </div>
	  
	  <div class="w3-display-container mySlides">
		<img src="https://tpc.googlesyndication.com/simgad/14045841722005816001" style="width:40%">
		<div class="w3-display-topright w3-large w3-container w3-padding-16 w3-black">
		 Fila Runners Women £100
		</div>
	  </div>
	  
	  <div class="w3-display-container mySlides">
		<img src="https://media.gucci.com/style/DarkGray_Center_0_0_800x800/1530812705/536532_GGZ30_1261_001_100_0000_Light-Flashtrek-sneaker-with-removable-crystals.jpg" style="width:40%">
		<div class="w3-display-middle w3-large w3-container w3-padding-16 w3-black">
			Flashtrek sneaker with removable crystals £1000
		</div>
	  </div>
	  
	  <button class="w3-button w3-display-left w3-black" onclick="plusDivs(-1)">&#10094;</button>
	  <button class="w3-button w3-display-right w3-black" onclick="plusDivs(1)">&#10095;</button>
	  
	  </div>
	  
	  <script>
	  var slideIndex = 1;
	  showDivs(slideIndex);
	  
	  function plusDivs(n) """),format.raw/*69.25*/("""{"""),format.raw/*69.26*/("""
		"""),format.raw/*70.3*/("""showDivs(slideIndex += n);
	  """),format.raw/*71.4*/("""}"""),format.raw/*71.5*/("""
	  
	  """),format.raw/*73.4*/("""function showDivs(n) """),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
		"""),format.raw/*74.3*/("""var i;
		var x = document.getElementsByClassName("mySlides");
		if (n > x.length) """),format.raw/*76.21*/("""{"""),format.raw/*76.22*/("""slideIndex = 1"""),format.raw/*76.36*/("""}"""),format.raw/*76.37*/("""
		"""),format.raw/*77.3*/("""if (n < 1) """),format.raw/*77.14*/("""{"""),format.raw/*77.15*/("""slideIndex = x.length"""),format.raw/*77.36*/("""}"""),format.raw/*77.37*/("""
		"""),format.raw/*78.3*/("""for (i = 0; i < x.length; i++) """),format.raw/*78.34*/("""{"""),format.raw/*78.35*/("""
		   """),format.raw/*79.6*/("""x[i].style.display = "none";  
		"""),format.raw/*80.3*/("""}"""),format.raw/*80.4*/("""
		"""),format.raw/*81.3*/("""x[slideIndex-1].style.display = "block";  
	  """),format.raw/*82.4*/("""}"""),format.raw/*82.5*/("""
	  """),format.raw/*83.4*/("""</script>

</div>
</div>

</div>

		<div class="col-sm-4">
		<div class="midcol">
				<img src="https://i.pinimg.com/originals/91/84/5b/91845b732fbbb0ad01edefb8467a7e59.jpg" alt="Rory Mciroy" width="300" height="600">
	
	
	
	</div>
</div>
<div class="col-sm-8"></div>
</div>
""")))}),format.raw/*100.2*/("""

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
                  DATE: Thu Apr 11 15:18:15 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/index.scala.html
                  HASH: 2a05462a610f98f4c778033d37cec891fc2f7a92
                  MATRIX: 959->1|1079->26|1107->29|1133->47|1171->48|1200->51|3768->2591|3797->2592|3828->2596|3886->2627|3914->2628|3951->2638|4000->2659|4029->2660|4060->2664|4172->2748|4201->2749|4243->2763|4272->2764|4303->2768|4342->2779|4371->2780|4420->2801|4449->2802|4480->2806|4539->2837|4568->2838|4602->2845|4663->2879|4691->2880|4722->2884|4796->2931|4824->2932|4856->2937|5180->3230
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|101->69|101->69|102->70|103->71|103->71|105->73|105->73|105->73|106->74|108->76|108->76|108->76|108->76|109->77|109->77|109->77|109->77|109->77|110->78|110->78|110->78|111->79|112->80|112->80|113->81|114->82|114->82|115->83|132->100
                  -- GENERATED --
              */
          