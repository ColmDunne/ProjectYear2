
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="icon" type="image/png" href=""""),_display_(/*8.43*/routes/*8.49*/.Assets.versioned("images/favicon.png")),format.raw/*8.88*/("""">
	<style>
	
	</style>
	<title>OFM """),_display_(/*12.14*/pagename),format.raw/*12.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">C.C.A SportsWare</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*21.12*/if(pagename == "Home")/*21.34*/{_display_(Seq[Any](format.raw/*21.35*/("""class="active"""")))}),format.raw/*21.50*/("""><a href=""""),_display_(/*21.61*/routes/*21.67*/.HomeController.index()),format.raw/*21.90*/("""">Home</a></li>
		    <li """),_display_(/*22.12*/if(pagename == "On Sale")/*22.37*/{_display_(Seq[Any](format.raw/*22.38*/("""class="active"""")))}),format.raw/*22.53*/("""><a href=""""),_display_(/*22.64*/routes/*22.70*/.HomeController.onsale()),format.raw/*22.94*/("""">On Sale</a></li>
		    <li """),_display_(/*23.12*/if(pagename == "About Us")/*23.38*/{_display_(Seq[Any](format.raw/*23.39*/("""class="active"""")))}),format.raw/*23.54*/("""><a href=""""),_display_(/*23.65*/routes/*23.71*/.HomeController.about()),format.raw/*23.94*/("""">About us</a></li>
		    <li """),_display_(/*24.12*/if(pagename == "Log In")/*24.36*/{_display_(Seq[Any](format.raw/*24.37*/("""class="active"""")))}),format.raw/*24.52*/(""">
				"""),_display_(/*25.6*/if(user != null)/*25.22*/ {_display_(Seq[Any](format.raw/*25.24*/("""
					"""),format.raw/*26.6*/("""<a href=""""),_display_(/*26.16*/routes/*26.22*/.LoginController.logout()),format.raw/*26.47*/("""">Log Out</a>
				""")))}/*27.7*/else/*27.12*/{_display_(Seq[Any](format.raw/*27.13*/("""
					"""),format.raw/*28.6*/("""<a href=""""),_display_(/*28.16*/routes/*28.22*/.LoginController.login()),format.raw/*28.46*/("""">Log In</a>
				""")))}),format.raw/*29.6*/("""					
			"""),format.raw/*30.4*/("""</li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well Red ">
			<h4>News</h4>
			<p>New items will be added shortly (adidas,Hugo boss,Ralph Lauren)</p>
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
                """),_display_(/*45.18*/content),format.raw/*45.25*/("""
            """),format.raw/*46.13*/("""</div>
		</div>
		<div class="col-sm-12">
		    <div class="well ">
			<h4>Call in Hours </h4>
			<h5>Mon-Fri 9:00-5:00 </h5>
		
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			<p>Website created Paddy, fish ,Collie </p>
		    </div>
		</div>
	    </div>
	</div>
	<script src=""""),_display_(/*64.16*/routes/*64.22*/.Assets.versioned("javascripts/main.js")),format.raw/*64.62*/(""""></script>
    </body>
</html>


"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 06 15:59:17 GMT 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/main.scala.html
                  HASH: 6e1e0affd455e27c82d105eb221c9b4c9adc5549
                  MATRIX: 970->1|1122->60|1423->335|1437->341|1496->380|1560->417|1589->425|1860->669|1891->691|1930->692|1976->707|2014->718|2029->724|2073->747|2127->774|2161->799|2200->800|2246->815|2284->826|2299->832|2344->856|2401->886|2436->912|2475->913|2521->928|2559->939|2574->945|2618->968|2676->999|2709->1023|2748->1024|2794->1039|2827->1046|2852->1062|2892->1064|2925->1070|2962->1080|2977->1086|3023->1111|3060->1131|3073->1136|3112->1137|3145->1143|3182->1153|3197->1159|3242->1183|3290->1201|3326->1210|3680->1537|3708->1544|3749->1557|4124->1905|4139->1911|4200->1951
                  LINES: 28->1|33->2|39->8|39->8|39->8|43->12|43->12|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|61->30|76->45|76->45|77->46|95->64|95->64|95->64
                  -- GENERATED --
              */
          