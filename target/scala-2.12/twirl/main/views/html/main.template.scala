
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
			<style>
				table, td """),format.raw/*6.15*/("""{"""),format.raw/*6.16*/("""
					"""),format.raw/*7.6*/("""border: 1px solid #333;
					border-collapse: collapse;
					background-color: #333;
					color: white;
					text-align:center;
				"""),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
				"""),format.raw/*13.5*/("""</style>	
			
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="icon" type="image/png" href=""""),_display_(/*18.43*/routes/*18.49*/.Assets.versioned("images/favicon.png")),format.raw/*18.88*/("""">
	<div class="container-fluid" ></div>
	<title>OFM """),_display_(/*20.14*/pagename),format.raw/*20.22*/("""</title>
    </head>
    <body >

		<style>
			body """),format.raw/*25.9*/("""{"""),format.raw/*25.10*/("""
			  """),format.raw/*26.6*/("""margin: 0;
			  font-family: Arial, Helvetica, sans-serif;
			"""),format.raw/*28.4*/("""}"""),format.raw/*28.5*/("""
			
			"""),format.raw/*30.4*/(""".topnav """),format.raw/*30.12*/("""{"""),format.raw/*30.13*/("""
			  """),format.raw/*31.6*/("""overflow: hidden;
			  background-color: #333;
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/("""
			
			"""),format.raw/*35.4*/(""".topnav a """),format.raw/*35.14*/("""{"""),format.raw/*35.15*/("""
			  """),format.raw/*36.6*/("""float: left;
			  color: #f2f2f2;
			  text-align: center;
			  padding: 14px 16px;
			  text-decoration: none;
			  font-size: 17px;
			"""),format.raw/*42.4*/("""}"""),format.raw/*42.5*/("""
			
			"""),format.raw/*44.4*/(""".topnav a:hover """),format.raw/*44.20*/("""{"""),format.raw/*44.21*/("""
			  """),format.raw/*45.6*/("""background-color: #ddd;
			  color: black;
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/("""
			
			"""),format.raw/*49.4*/(""".topnav a.active """),format.raw/*49.21*/("""{"""),format.raw/*49.22*/("""
			  """),format.raw/*50.6*/("""background-color: chartreuse;
			  color: #333;
			"""),format.raw/*52.4*/("""}"""),format.raw/*52.5*/("""
			"""),format.raw/*53.4*/("""</style>
			</head>
			<body>
			
			<div class="topnav">
			  <a class="active" href=""""),_display_(/*58.31*/routes/*58.37*/.HomeController.index()),format.raw/*58.60*/("""">C.C.A SportsWare</a>
			  <a href=""""),_display_(/*59.16*/routes/*59.22*/.HomeController.index()),format.raw/*59.45*/("""">Home</a>
			  <a href=""""),_display_(/*60.16*/routes/*60.22*/.HomeController.onsale()),format.raw/*60.46*/("""">On Sale</a>
			  <a href=""""),_display_(/*61.16*/routes/*61.22*/.HomeController.about()),format.raw/*61.45*/("""">About us / F.A.Q</a>
			  """),_display_(/*62.7*/if(user != null)/*62.23*/ {_display_(Seq[Any](format.raw/*62.25*/("""
				"""),format.raw/*63.5*/("""<a href=""""),_display_(/*63.15*/routes/*63.21*/.LoginController.logout()),format.raw/*63.46*/("""">Log Out</a>
			""")))}/*64.6*/else/*64.11*/{_display_(Seq[Any](format.raw/*64.12*/("""
				"""),format.raw/*65.5*/("""<a href=""""),_display_(/*65.15*/routes/*65.21*/.LoginController.login()),format.raw/*65.45*/("""">Log In</a>
			""")))}),format.raw/*66.5*/("""	
			"""),format.raw/*67.4*/("""<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a>
			
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
					<button style="background-color: chartreuse" style="color:white;" class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				  </form>
				</div>
			  
			</div>
		
		</div>

		</div>
		<div class="container-fluid"style="background-color:white"style>
		<div class="col-sm-4"style="background-color: chartreuse" style="text-align:center;"><b style="color:#333">Free deliverys over &euro;60 !</b></div>
		<div class="col-sm-4"style="background-color:white" style="text-align:center"><b >Half Price sale soon stay tuned! </b></div>
		<div class="col-sm-4"style="background-color:orange" style="text-align:center"><b style="color:#333">Cheapest prices guaranteed! </b></div>
	</div>






	</nav>
	
	

	
	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-12">
		    <div class="">
					<table style="width:100%">
						<tr>
							<td style = "color:chartreuse"><b>Day</b></td>
							<td style = "color: chartreuse"><b>Opening Hours</b></td>
							<td style = "color: chartreuse"><b>Contacts</b></td> 
						</tr>
						<tr>
							<td>Monday</td>
							<td>9:00-17:00</td>
							<td>Colm - 014567891</td>
						</tr>
						<tr>
							<td>Tuesday</td>
							<td>9:00-17:00</td>
						  <td>Conor - 012345678</td>
						</tr>
						<tr>
							<td>Wednesday</td>
							<td>9:00-17:00</td>
							<td>Andrei - 019876543</td>
						</tr>
						<tr>
							<td>Thursday</td>
							<td>9:00-17:00</td>
						  <td>Colm@gmail.com</td>
						</tr>
						<tr>
							<td>Friday</td>
							<td>9:00-17:00</td>
						  <td>Conor@gmail.com</td>
						</tr>
						<tr>
							<td>Saturday</td>
							<td>12:00-20:00</td>
              <td>Andrei@gmail.com</td>
						</tr>
						<tr>
							<td>Sunday</td>
							<td>12:00-20:00</td>
						  <td></td>
						</tr>
					</table>
		    </div>
		</div>
		
</div>
</div>


<div class="col-sm-8">
		<div class="midcol">
							"""),_display_(/*156.9*/content),format.raw/*156.16*/("""
						"""),format.raw/*157.7*/("""</div>
					</div>
			
			
					<div class="col-sm-12" style="background-color:#333">
						<p style="color:#ddd" align="center">Copyright &copy; 2019 C.C.A SportsWare. All rights reserved to Colm,Conor & Andrei.</p>
					</div>
					</div>
	    </div>
	</div>
	<script src=""""),_display_(/*167.16*/routes/*167.22*/.Assets.versioned("javascripts/main.js")),format.raw/*167.62*/(""""></script>
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
                  DATE: Thu Apr 18 14:38:07 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/main.scala.html
                  HASH: fbee61c63788f86116388e96fee8c2dd1fd9ac45
                  MATRIX: 970->1|1122->60|1208->119|1236->120|1268->126|1427->258|1455->259|1487->264|1769->519|1784->525|1844->564|1925->618|1954->626|2033->678|2062->679|2095->685|2184->747|2212->748|2247->756|2283->764|2312->765|2345->771|2422->821|2450->822|2485->830|2523->840|2552->841|2585->847|2749->984|2777->985|2812->993|2856->1009|2885->1010|2918->1016|2991->1062|3019->1063|3054->1071|3099->1088|3128->1089|3161->1095|3239->1146|3267->1147|3298->1151|3413->1239|3428->1245|3472->1268|3537->1306|3552->1312|3596->1335|3649->1361|3664->1367|3709->1391|3765->1420|3780->1426|3824->1449|3879->1478|3904->1494|3944->1496|3976->1501|4013->1511|4028->1517|4074->1542|4110->1561|4123->1566|4162->1567|4194->1572|4231->1582|4246->1588|4291->1612|4338->1629|4370->1634|7054->4294|7083->4301|7118->4308|7422->4584|7438->4590|7500->4630
                  LINES: 28->1|33->2|37->6|37->6|38->7|43->12|43->12|44->13|49->18|49->18|49->18|51->20|51->20|56->25|56->25|57->26|59->28|59->28|61->30|61->30|61->30|62->31|64->33|64->33|66->35|66->35|66->35|67->36|73->42|73->42|75->44|75->44|75->44|76->45|78->47|78->47|80->49|80->49|80->49|81->50|83->52|83->52|84->53|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|98->67|187->156|187->156|188->157|198->167|198->167|198->167
                  -- GENERATED --
              */
          