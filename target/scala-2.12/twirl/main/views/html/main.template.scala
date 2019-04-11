
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
			
			<div class="container-fluid" style =background-color:;>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="icon" type="image/png" href=""""),_display_(/*10.43*/routes/*10.49*/.Assets.versioned("images/favicon.png")),format.raw/*10.88*/("""">
	<style>
	
	</style>
	<title>OFM """),_display_(/*14.14*/pagename),format.raw/*14.22*/("""</title>
    </head>
    <body >
	<nav style="background-color:black;">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href=""""),_display_(/*20.38*/routes/*20.44*/.HomeController.index()),format.raw/*20.67*/("""">C.C.A SportsWare</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*23.12*/if(pagename == "Home")/*23.34*/{_display_(Seq[Any](format.raw/*23.35*/("""class="active"""")))}),format.raw/*23.50*/("""><a href=""""),_display_(/*23.61*/routes/*23.67*/.HomeController.index()),format.raw/*23.90*/("""">Home</a></li>
		    <li """),_display_(/*24.12*/if(pagename == "On Sale")/*24.37*/{_display_(Seq[Any](format.raw/*24.38*/("""class="active"""")))}),format.raw/*24.53*/("""><a href=""""),_display_(/*24.64*/routes/*24.70*/.HomeController.onsale()),format.raw/*24.94*/("""">On Sale</a></li>
			<li """),_display_(/*25.9*/if(pagename == "About Us")/*25.35*/{_display_(Seq[Any](format.raw/*25.36*/("""class="active"""")))}),format.raw/*25.51*/("""><a href=""""),_display_(/*25.62*/routes/*25.68*/.HomeController.about()),format.raw/*25.91*/("""">About us / F.A.Q</a></li>
		    <li """),_display_(/*26.12*/if(pagename == "Log In")/*26.36*/{_display_(Seq[Any](format.raw/*26.37*/("""class="active"""")))}),format.raw/*26.52*/(""">
				"""),_display_(/*27.6*/if(user != null)/*27.22*/ {_display_(Seq[Any](format.raw/*27.24*/("""
					"""),format.raw/*28.6*/("""<a href=""""),_display_(/*28.16*/routes/*28.22*/.LoginController.logout()),format.raw/*28.47*/("""">Log Out</a>
				""")))}/*29.7*/else/*29.12*/{_display_(Seq[Any](format.raw/*29.13*/("""
					"""),format.raw/*30.6*/("""<a href=""""),_display_(/*30.16*/routes/*30.22*/.LoginController.login()),format.raw/*30.46*/("""">Log In</a>
				""")))}),format.raw/*31.6*/("""	
							
			"""),format.raw/*33.4*/("""</li>
			
		</ul>
		</div>
		<div class="container-fluid"style="background-color:white"style>
		<div class="col-sm-4"style="background-color:green" style="text-align:center;"><b>Free deliverys over 60 euro!</b></div>
		<div class="col-sm-4"style="background-color:white" style="text-align:center"><b>Half Price sale soon stay tuned! </b></div>
		<div class="col-sm-4"style="background-color:orange" style="text-align:center"><b>Cheapest prices guardinted! </b></div>
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
							"""),_display_(/*62.9*/content),format.raw/*62.16*/("""
						"""),format.raw/*63.7*/("""</div>
					</div>
			
			
		<div class="col-sm-12 " >
		    <div class="well ">
			<h4>Call in Hours </h4>
			<h5>Mon-Fri 9:00-5:00 </h5>
		
		    </div>
		</div>
	    </div>
	</div>
	<script src=""""),_display_(/*76.16*/routes/*76.22*/.Assets.versioned("javascripts/main.js")),format.raw/*76.62*/(""""></script>
</div>
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
                  DATE: Thu Apr 11 14:33:11 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/main.scala.html
                  HASH: 28d64cd2a6dc80b560093b2662fcd76c263c6015
                  MATRIX: 970->1|1122->60|1487->398|1502->404|1562->443|1626->480|1655->488|1856->662|1871->668|1915->691|2015->764|2046->786|2085->787|2131->802|2169->813|2184->819|2228->842|2282->869|2316->894|2355->895|2401->910|2439->921|2454->927|2499->951|2552->978|2587->1004|2626->1005|2672->1020|2710->1031|2725->1037|2769->1060|2835->1099|2868->1123|2907->1124|2953->1139|2986->1146|3011->1162|3051->1164|3084->1170|3121->1180|3136->1186|3182->1211|3219->1231|3232->1236|3271->1237|3304->1243|3341->1253|3356->1259|3401->1283|3449->1301|3489->1314|4304->2103|4332->2110|4366->2117|4592->2316|4607->2322|4668->2362
                  LINES: 28->1|33->2|41->10|41->10|41->10|45->14|45->14|51->20|51->20|51->20|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|64->33|93->62|93->62|94->63|107->76|107->76|107->76
                  -- GENERATED --
              */
          