
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.UserPassword2],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(regForm: Form[models.users.UserPassword2],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register User",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class="lead">Sign up for our Website!</p>

    """),format.raw/*8.57*/("""
	"""),_display_(/*9.3*/if(flash.containsKey("error"))/*9.33*/ {_display_(Seq[Any](format.raw/*9.35*/("""
		"""),format.raw/*10.3*/("""<div class="alert alert-success">
			"""),_display_(/*11.5*/flash/*11.10*/.get("error")),format.raw/*11.23*/("""
		"""),format.raw/*12.3*/("""</div>
	""")))}),format.raw/*13.3*/("""

    """),format.raw/*15.5*/("""<!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*18.6*/form(action=routes.LoginController.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*18.108*/ {_display_(Seq[Any](format.raw/*18.110*/("""
        """),format.raw/*19.37*/("""
        """),format.raw/*20.99*/("""
        """),_display_(/*21.10*/CSRF/*21.14*/.formField),format.raw/*21.24*/("""


            """),_display_(/*24.14*/inputText(regForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*24.87*/("""       
            """),_display_(/*25.14*/inputText(regForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.85*/("""
            """),_display_(/*26.14*/inputDate(regForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*26.121*/("""
            """),_display_(/*27.14*/inputText(regForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*27.93*/("""
            """),_display_(/*28.14*/inputText(regForm("password"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*28.101*/("""
            
            """),_display_(/*30.14*/inputText(regForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*30.104*/("""
            """),_display_(/*31.14*/inputText(regForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*31.77*/("""
            
            """),format.raw/*33.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Sign Up" class="btn btn-primary">
                <a href=""""),_display_(/*39.27*/routes/*39.33*/.LoginController.registerUser()),format.raw/*39.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*43.6*/(""" """),format.raw/*43.24*/("""
""")))}),format.raw/*44.2*/(""" """))
      }
    }
  }

  def render(regForm:Form[models.users.UserPassword2],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(regForm,user)

  def f:((Form[models.users.UserPassword2],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (regForm,user) => apply(regForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 26 17:56:58 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/registerUser.scala.html
                  HASH: 413721caedbadf227b82e3991fd0acb9148379af
                  MATRIX: 999->1|1139->71|1183->69|1210->87|1237->89|1271->115|1309->116|1340->121|1417->223|1445->226|1483->256|1522->258|1552->261|1616->299|1630->304|1664->317|1694->320|1733->329|1766->335|2045->588|2157->690|2198->692|2235->729|2272->828|2309->838|2322->842|2353->852|2396->868|2490->941|2538->962|2630->1033|2671->1047|2800->1154|2841->1168|2941->1247|2982->1261|3091->1348|3145->1375|3257->1465|3298->1479|3382->1542|3436->1568|3820->1925|3835->1931|3887->1962|4047->2092|4076->2110|4108->2112
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|46->15|49->18|49->18|49->18|50->19|51->20|52->21|52->21|52->21|55->24|55->24|56->25|56->25|57->26|57->26|58->27|58->27|59->28|59->28|61->30|61->30|62->31|62->31|64->33|70->39|70->39|70->39|74->43|74->43|75->44
                  -- GENERATED --
              */
          