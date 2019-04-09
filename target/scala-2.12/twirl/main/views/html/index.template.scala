
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

		"""),format.raw/*4.3*/("""<div class="col-sm-4">
		<div class="midcol">
				<img src="https://upload.wikimedia.org/wikipedia/commons/b/b8/Messi_vs_Nigeria_2018.jpg" alt="Lamp" width="250" height="500">
	
	
	</div>
	</div>
	>

</div>

		<div style="text-align:center;"class="col-sm-6" >
	<h1 >Welcome to C.C.A SportsWare!</h1>
	<h3>The place where you can buy the top sports clothing brands</h3>




</div>
</div>

</div>

		<div class="col-sm-4">
		<div class="midcol">
				<img src="https://cdn4.img.sputniknews.com/images/107064/58/1070645880.jpg" alt="Lamp" width="250" height="500">
	
	
	
	</div>
</div>

""")))}),format.raw/*36.2*/("""

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
                  DATE: Tue Apr 09 14:38:12 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/index.scala.html
                  HASH: 2fd50ad88beda6542e979e2e996520a3586ec8d2
                  MATRIX: 959->1|1079->26|1107->29|1133->47|1171->48|1203->54|1849->670
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|68->36
                  -- GENERATED --
              */
          