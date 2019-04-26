
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
	<link rel="icon" type="image/png" href=""""),_display_(/*10.43*/routes/*10.49*/.Assets.versioned("images/favicon.png")),format.raw/*10.88*/("""">
	<div class="container-fluid" ></div>
	<title>OFM """),_display_(/*12.14*/pagename),format.raw/*12.22*/("""</title>
    </head>
    <body >

		<style>
			body """),format.raw/*17.9*/("""{"""),format.raw/*17.10*/("""
			  """),format.raw/*18.6*/("""margin: 0;
			  font-family: Arial, Helvetica, sans-serif;
			"""),format.raw/*20.4*/("""}"""),format.raw/*20.5*/("""
			
			"""),format.raw/*22.4*/(""".topnav """),format.raw/*22.12*/("""{"""),format.raw/*22.13*/("""
			  """),format.raw/*23.6*/("""overflow: hidden;
			  background-color: #333;
			"""),format.raw/*25.4*/("""}"""),format.raw/*25.5*/("""
			
			"""),format.raw/*27.4*/(""".topnav a """),format.raw/*27.14*/("""{"""),format.raw/*27.15*/("""
			  """),format.raw/*28.6*/("""float: left;
			  color: #f2f2f2;
			  text-align: center;
			  padding: 14px 16px;
			  text-decoration: none;
			  font-size: 17px;
			"""),format.raw/*34.4*/("""}"""),format.raw/*34.5*/("""
			
			"""),format.raw/*36.4*/(""".topnav a:hover """),format.raw/*36.20*/("""{"""),format.raw/*36.21*/("""
			  """),format.raw/*37.6*/("""background-color: #ddd;
			  color: black;
			"""),format.raw/*39.4*/("""}"""),format.raw/*39.5*/("""
			
			"""),format.raw/*41.4*/(""".topnav a.active """),format.raw/*41.21*/("""{"""),format.raw/*41.22*/("""
			  """),format.raw/*42.6*/("""background-color: chartreuse;
			  color: #333;
			"""),format.raw/*44.4*/("""}"""),format.raw/*44.5*/("""table, td """),format.raw/*44.15*/("""{"""),format.raw/*44.16*/("""
					"""),format.raw/*45.6*/("""border: 1px solid #333;
					border-collapse: collapse;
					background-color: #333;
					color: white;
					text-align:center;
				"""),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""
				"""),format.raw/*51.5*/("""a.a"""),format.raw/*51.8*/("""{"""),format.raw/*51.9*/("""
					"""),format.raw/*52.6*/("""font-style:italic;
					background-color: chartreuse;
					color: #333
				"""),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""
			"""),format.raw/*56.4*/("""</style>
			</head>
			<body>
			
			<div class="topnav">
			  <a class = "a" class="active" href=""""),_display_(/*61.43*/routes/*61.49*/.HomeController.index()),format.raw/*61.72*/("""">C.C.A SportsWear</a>
			  <a href=""""),_display_(/*62.16*/routes/*62.22*/.HomeController.index()),format.raw/*62.45*/("""">Home</a>
			  <a href=""""),_display_(/*63.16*/routes/*63.22*/.HomeController.onsale()),format.raw/*63.46*/("""">On Sale</a>
			  <a href=""""),_display_(/*64.16*/routes/*64.22*/.HomeController.about()),format.raw/*64.45*/("""">About us / F.A.Q</a>
				"""),_display_(/*65.6*/if(user == null)/*65.22*/ {_display_(Seq[Any](format.raw/*65.24*/("""
					"""),format.raw/*66.6*/("""<a href=""""),_display_(/*66.16*/routes/*66.22*/.LoginController.registerUser()),format.raw/*66.53*/("""">Sign Up</a>
					""")))}),format.raw/*67.7*/("""
				"""),_display_(/*68.6*/if(user != null)/*68.22*/ {_display_(Seq[Any](format.raw/*68.24*/("""
				"""),format.raw/*69.5*/("""<a href=""""),_display_(/*69.15*/routes/*69.21*/.LoginController.logout()),format.raw/*69.46*/("""">Log Out</a>
			""")))}/*70.6*/else/*70.11*/{_display_(Seq[Any](format.raw/*70.12*/("""
				"""),format.raw/*71.5*/("""<a href=""""),_display_(/*71.15*/routes/*71.21*/.LoginController.login()),format.raw/*71.45*/("""">Log In</a>
			""")))}),format.raw/*72.5*/("""	
			
			
			"""),format.raw/*75.4*/("""<div align="right">
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
					<button style="background-color: chartreuse" style="color:white;" class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
					</form>
				</div>
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
						  <td>Help@gmail.com</td>
						</tr>
					</table>
		    </div>
		</div>
		
</div>
</div>


<div class="col-sm-8">
		<div class="midcol">
							"""),_display_(/*159.9*/content),format.raw/*159.16*/("""
						"""),format.raw/*160.7*/("""</div>
					</div>
			
			
					<div class="col-sm-12" style="background-color:#333">
						<p style="color:#ddd" align="center">Copyright &copy; 2019 C.C.A SportsWare. All rights reserved to Colm,Conor & Andrei.</p>
					</div>
					</div>
	    </div>
	</div>
	<script src=""""),_display_(/*170.16*/routes/*170.22*/.Assets.versioned("javascripts/main.js")),format.raw/*170.62*/(""""></script>
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
                  DATE: Fri Apr 26 18:08:27 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/main.scala.html
                  HASH: 68f28b76ce5c223d61bd4eadacc22f10d76f151d
                  MATRIX: 970->1|1122->60|1433->344|1448->350|1508->389|1589->443|1618->451|1697->503|1726->504|1759->510|1848->572|1876->573|1911->581|1947->589|1976->590|2009->596|2086->646|2114->647|2149->655|2187->665|2216->666|2249->672|2413->809|2441->810|2476->818|2520->834|2549->835|2582->841|2655->887|2683->888|2718->896|2763->913|2792->914|2825->920|2903->971|2931->972|2969->982|2998->983|3031->989|3190->1121|3218->1122|3250->1127|3280->1130|3308->1131|3341->1137|3443->1212|3471->1213|3502->1217|3629->1317|3644->1323|3688->1346|3753->1384|3768->1390|3812->1413|3865->1439|3880->1445|3925->1469|3981->1498|3996->1504|4040->1527|4094->1555|4119->1571|4159->1573|4192->1579|4229->1589|4244->1595|4296->1626|4346->1646|4378->1652|4403->1668|4443->1670|4475->1675|4512->1685|4527->1691|4573->1716|4609->1735|4622->1740|4661->1741|4693->1746|4730->1756|4745->1762|4790->1786|4837->1803|4877->1816|7004->3920|7033->3927|7068->3934|7372->4210|7388->4216|7450->4256
                  LINES: 28->1|33->2|41->10|41->10|41->10|43->12|43->12|48->17|48->17|49->18|51->20|51->20|53->22|53->22|53->22|54->23|56->25|56->25|58->27|58->27|58->27|59->28|65->34|65->34|67->36|67->36|67->36|68->37|70->39|70->39|72->41|72->41|72->41|73->42|75->44|75->44|75->44|75->44|76->45|81->50|81->50|82->51|82->51|82->51|83->52|86->55|86->55|87->56|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|106->75|190->159|190->159|191->160|201->170|201->170|201->170
                  -- GENERATED --
              */
          