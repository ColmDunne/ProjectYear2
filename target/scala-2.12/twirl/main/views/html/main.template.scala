
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
			<li """),_display_(/*23.9*/if(pagename == "About Us")/*23.35*/{_display_(Seq[Any](format.raw/*23.36*/("""class="active"""")))}),format.raw/*23.51*/("""><a href=""""),_display_(/*23.62*/routes/*23.68*/.HomeController.about()),format.raw/*23.91*/("""">About us / F.A.Q</a></li>
		    <li """),_display_(/*24.12*/if(pagename == "Log In")/*24.36*/{_display_(Seq[Any](format.raw/*24.37*/("""class="active"""")))}),format.raw/*24.52*/(""">
				"""),_display_(/*25.6*/if(user != null)/*25.22*/ {_display_(Seq[Any](format.raw/*25.24*/("""
					"""),format.raw/*26.6*/("""<a href=""""),_display_(/*26.16*/routes/*26.22*/.LoginController.logout()),format.raw/*26.47*/("""">Log Out</a>
				""")))}/*27.7*/else/*27.12*/{_display_(Seq[Any](format.raw/*27.13*/("""
					"""),format.raw/*28.6*/("""<a href=""""),_display_(/*28.16*/routes/*28.22*/.LoginController.login()),format.raw/*28.46*/("""">Log In</a>
				""")))}),format.raw/*29.6*/("""	
							
			"""),format.raw/*31.4*/("""</li>
			<li >
					<form class="form-inline">
							<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
							<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
						  </form>	
			  </li>
		</ul>
		</div>
		
	</nav>

	
	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well  ">
			<h4>News</h4>
			<p>New items will be added shortly (adidas,Hugo boss,Ralph Lauren)</p>
		    </div>
		</div>
		
</div>
</div>


<div class="col-sm-8">
		<div class="midcol">
							"""),_display_(/*59.9*/content),format.raw/*59.16*/("""
						"""),format.raw/*60.7*/("""</div>
					</div>
			
			
		<div class="col-sm-12 " >
		    <div class="well ">
			<h4>Call in Hours </h4>
			<h5>Mon-Fri 9:00-5:00 </h5>
		
		    </div>
		</div>
	    </div>
	</div>
	<script src=""""),_display_(/*73.16*/routes/*73.22*/.Assets.versioned("javascripts/main.js")),format.raw/*73.62*/(""""></script>
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
                  DATE: Tue Apr 09 14:18:54 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/main.scala.html
                  HASH: 44a12505198dbf91a37d1b3e917aa75f7142278d
                  MATRIX: 970->1|1122->60|1423->335|1437->341|1496->380|1560->417|1589->425|1860->669|1891->691|1930->692|1976->707|2014->718|2029->724|2073->747|2127->774|2161->799|2200->800|2246->815|2284->826|2299->832|2344->856|2397->883|2432->909|2471->910|2517->925|2555->936|2570->942|2614->965|2680->1004|2713->1028|2752->1029|2798->1044|2831->1051|2856->1067|2896->1069|2929->1075|2966->1085|2981->1091|3027->1116|3064->1136|3077->1141|3116->1142|3149->1148|3186->1158|3201->1164|3246->1188|3294->1206|3334->1219|3948->1807|3976->1814|4010->1821|4236->2020|4251->2026|4312->2066
                  LINES: 28->1|33->2|39->8|39->8|39->8|43->12|43->12|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|62->31|90->59|90->59|91->60|104->73|104->73|104->73
                  -- GENERATED --
              */
          