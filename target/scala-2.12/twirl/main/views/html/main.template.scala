
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
    <body >
	<nav style="background-color:black;">
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
		<div class="container-fluid"style="background-color:white"style>
		<div class="col-sm-4"style="background-color:green" style="text-align:center;"><p>Free deliverys over 60 euro!</p></div>
		<div class="col-sm-4"style="background-color:white" style="text-align:center"><p>Half Price sale soon stay tuned! </p></div>
		<div class="col-sm-4"style="background-color:orange" style="text-align:center"><p>Cheapest prices guardinted! </p></div>
	</div>
	</nav>
	
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
							"""),_display_(/*65.9*/content),format.raw/*65.16*/("""
						"""),format.raw/*66.7*/("""</div>
					</div>
			
			
		<div class="col-sm-12 " >
		    <div class="well ">
			<h4>Call in Hours </h4>
			<h5>Mon-Fri 9:00-5:00 </h5>
		
		    </div>
		</div>
	    </div>
	</div>
	<script src=""""),_display_(/*79.16*/routes/*79.22*/.Assets.versioned("javascripts/main.js")),format.raw/*79.62*/(""""></script>
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
                  DATE: Tue Apr 09 15:58:52 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/main.scala.html
                  HASH: 73255c9cbdc511f6e5a04ee1b2dab824b458f38a
                  MATRIX: 970->1|1122->60|1423->335|1437->341|1496->380|1560->417|1589->425|1863->672|1894->694|1933->695|1979->710|2017->721|2032->727|2076->750|2130->777|2164->802|2203->803|2249->818|2287->829|2302->835|2347->859|2400->886|2435->912|2474->913|2520->928|2558->939|2573->945|2617->968|2683->1007|2716->1031|2755->1032|2801->1047|2834->1054|2859->1070|2899->1072|2932->1078|2969->1088|2984->1094|3030->1119|3067->1139|3080->1144|3119->1145|3152->1151|3189->1161|3204->1167|3249->1191|3297->1209|3337->1222|4406->2265|4434->2272|4468->2279|4694->2478|4709->2484|4770->2524
                  LINES: 28->1|33->2|39->8|39->8|39->8|43->12|43->12|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|62->31|96->65|96->65|97->66|110->79|110->79|110->79
                  -- GENERATED --
              */
          