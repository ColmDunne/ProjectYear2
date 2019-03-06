
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
	"""),format.raw/*3.2*/("""<h4>About us</h4>
	<h5>Conor Mc Donnell:</h5>
<p></p> I am a student in T.U dublin (Tallaght) currently studying Computer science. I am twenty years old i am in second year</p> 
<h5>Colm Dunne:</h5>
<p> I am a student in T.U dublin (Tallaght) currently studying Computer science. I am twenty years old i am in second year</p> 
<h5>Andrei Iancu:</h5>
<p> I am a student in T.U dublin (Tallaght) currently studying Computer science. I am twenty years old i am in second year</p> 



""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 06 15:23:12 GMT 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/about.scala.html
                  HASH: c019cbd7ce458918d6e1bb445f6310af440cec07
                  MATRIX: 959->1|1079->26|1107->29|1137->51|1176->53|1205->56
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3
                  -- GENERATED --
              */
          