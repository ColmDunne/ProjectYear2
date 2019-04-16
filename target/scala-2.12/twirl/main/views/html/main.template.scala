
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
			  """),format.raw/*42.6*/("""background-color: #4CAF50;
			  color: white;
			"""),format.raw/*44.4*/("""}"""),format.raw/*44.5*/("""
			"""),format.raw/*45.4*/("""</style>
			</head>
			<body>
			
			<div class="topnav">
			  <a class="active" href=""""),_display_(/*50.31*/routes/*50.37*/.HomeController.index()),format.raw/*50.60*/("""">C.C.A SportsWare</a>
			  <a href=""""),_display_(/*51.16*/routes/*51.22*/.HomeController.index()),format.raw/*51.45*/("""">Home</a>
			  <a href=""""),_display_(/*52.16*/routes/*52.22*/.HomeController.onsale()),format.raw/*52.46*/("""">On Sale</a>
			  <a href=""""),_display_(/*53.16*/routes/*53.22*/.HomeController.about()),format.raw/*53.45*/("""">About us / F.A.Q</a>
			  """),_display_(/*54.7*/if(user != null)/*54.23*/ {_display_(Seq[Any](format.raw/*54.25*/("""
				"""),format.raw/*55.5*/("""<a href=""""),_display_(/*55.15*/routes/*55.21*/.LoginController.logout()),format.raw/*55.46*/("""">Log Out</a>
			""")))}/*56.6*/else/*56.11*/{_display_(Seq[Any](format.raw/*56.12*/("""
				"""),format.raw/*57.5*/("""<a href=""""),_display_(/*57.15*/routes/*57.21*/.LoginController.login()),format.raw/*57.45*/("""">Log In</a>
			""")))}),format.raw/*58.5*/("""	
			"""),format.raw/*59.4*/("""<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
			<a><div></div></a><a><div></div></a>
			
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
					<button style="background-color: #4CAF50" style="color:white;" class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				  </form>
				</div>
			  
			</div>
		
		</div>

		</div>
		<div class="container-fluid"style="background-color:white"style>
		<div class="col-sm-4"style="background-color: #4CAF50" style="text-align:center;"><b style="color:white">Free deliverys over 60 euro!</b></div>
		<div class="col-sm-4"style="background-color:white" style="text-align:center"><b >Half Price sale soon stay tuned! </b></div>
		<div class="col-sm-4"style="background-color:orange" style="text-align:center"><b style="color:white">Cheapest prices guardinted! </b></div>
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
							"""),_display_(/*108.9*/content),format.raw/*108.16*/("""
						"""),format.raw/*109.7*/("""</div>
					</div>
			
			
		<div class="col-sm-12 " >
		    <div class="well ">
			<h4>Call in Hours </h4>
			<h5>Mon-Fri 9:00-5:00 </h5>
		
		    </div>
		</div>
	    </div>
	</div>
	<script src=""""),_display_(/*122.16*/routes/*122.22*/.Assets.versioned("javascripts/main.js")),format.raw/*122.62*/(""""></script>
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
                  DATE: Tue Apr 16 15:35:34 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/main.scala.html
                  HASH: af8ed95a9b298fd482e0cc6b94210b45ad77bf1f
                  MATRIX: 970->1|1122->60|1432->343|1447->349|1507->388|1588->442|1617->450|1696->502|1725->503|1758->509|1847->571|1875->572|1910->580|1946->588|1975->589|2008->595|2085->645|2113->646|2148->654|2186->664|2215->665|2248->671|2412->808|2440->809|2475->817|2519->833|2548->834|2581->840|2654->886|2682->887|2717->895|2762->912|2791->913|2824->919|2900->968|2928->969|2959->973|3074->1061|3089->1067|3133->1090|3198->1128|3213->1134|3257->1157|3310->1183|3325->1189|3370->1213|3426->1242|3441->1248|3485->1271|3540->1300|3565->1316|3605->1318|3637->1323|3674->1333|3689->1339|3735->1364|3771->1383|3784->1388|3823->1389|3855->1394|3892->1404|3907->1410|3952->1434|3999->1451|4031->1456|5810->3208|5839->3215|5874->3222|6101->3421|6117->3427|6179->3467
                  LINES: 28->1|33->2|41->10|41->10|41->10|43->12|43->12|48->17|48->17|49->18|51->20|51->20|53->22|53->22|53->22|54->23|56->25|56->25|58->27|58->27|58->27|59->28|65->34|65->34|67->36|67->36|67->36|68->37|70->39|70->39|72->41|72->41|72->41|73->42|75->44|75->44|76->45|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|90->59|139->108|139->108|140->109|153->122|153->122|153->122
                  -- GENERATED --
              */
          