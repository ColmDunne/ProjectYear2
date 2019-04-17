
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("About Us", user)/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
	"""),format.raw/*3.2*/("""<div class="col-sm-4">

	</div>

	<div class="col-sm-8">
	<div style="text-align:center;">
	<h2 align="center">About us</h2>
<h4 style="color:Tomato;"><b>Conor Mc Donnell: Conor@gmail.com</b></h4>
<p > I am a student in T.U dublin (Tallaght) currently studying Computer science.
	 I am twenty years old i am in second year Im working par-time in Dunnes in the ilac. My plan is to stay there until im finished college.</p> 
<h4 style="color:Tomato;"><b>Colm Dunne: Colm@gmail.com</b></h4>
<p> I am a student in T.U dublin (Tallaght) currently studying Computer science. I am nineteen years old i am in second year i am working in Dunnes in the ashleaf. my plan for the future is to stay until i am finished college </p> 
<h4 style="color:Tomato;"><b>Andrei Iancu: Andrei@gmail.com</b></h4>
<p> I am a student in T.U dublin (Tallaght) currently studying Computer science. I am twenty years old i am in second year and am a pea head</p> 
</div>
<h2 align="center">F.A.Q</h2>
<div class="col-sm-12">
	<div class="well "style="background-color:#333;">
<h5 style="color: white;"><b>1.How long does delivery take ? </b></h5>

<p style="color: white;">-On average it takes 3-5 working days.</p>
<br>

	</div>
</div>

<div class="col-sm-12">
	<div class="well "style="background-color:#333;" style="color: white;">
<h5 style="color: white;"><b>2.I'm an international customer. Does the price include customs fees/import taxes? </b></h5>
<p style="color: white;">-The fee covers the import tax but additional fees apply for certain countries</p>

</div>
</div>

<div class="col-sm-12">
	<div class="well "style="background-color:#333;">
<h5 style="color: white;"><b>3.Are you on any social media ?</b></h5>
<p style="color: white;">-Yes we have a Facebook and we are currently working on other platforms.</p>
<br>
</div>
</div>

<div class="col-sm-12">
	<div class="well "style="background-color:#333;">

<h5 style="color: white;"><b>4.how often do we update our website </b></h5>
<p style="color: white;">-We try our best to update it every 2-3 days and when we have new products we do it straight away.</p>
</div>
</div>

<div class="col-sm-12">
	<div class="well "style="background-color:#333;">
<h5 style="color: white;"><b>5.I would like to return an order what do I do ? </b></h5>
<p style="color: white;">-Send an email to help@gmail.com for further issue on this matter.</p>
<br>
<br>
</div>
</div>
<div class="col-sm-2"></div>
<div class="col-sm-12">
	<div class="well "style="background-color:#333;">
<h5 style="color: white;"><b>6.what payment method can I use ? </b></h5>
<p style="color: white;">-You can use any of the cards listed below to pay for your order. You can also use PayPal to shop with us. Visa, Visa Electron, Mastercard, Maestro, One4All and PayPal.</p>
</div>
</div>
</div>













""")))}),format.raw/*82.2*/("""












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
                  DATE: Wed Apr 17 15:42:20 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/about.scala.html
                  HASH: 7bc9a2b38fa4c2eeb977432ada45ce7db54e272b
                  MATRIX: 959->1|1079->26|1107->29|1137->51|1176->53|1205->56|4121->2946
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|114->82
                  -- GENERATED --
              */
          