
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
				table, th, td """),format.raw/*6.19*/("""{"""),format.raw/*6.20*/("""
					"""),format.raw/*7.6*/("""border: 1px solid #333;
					border-collapse: collapse;
					background-color: #333;
					color: white;
					text-align:center;
				"""),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
				"""),format.raw/*13.5*/("""th"""),format.raw/*13.7*/("""{"""),format.raw/*13.8*/("""
				
          """),format.raw/*15.11*/("""text-align: center;
				"""),format.raw/*16.5*/("""}"""),format.raw/*16.6*/("""
				"""),format.raw/*17.5*/("""</style>	
			
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="icon" type="image/png" href=""""),_display_(/*22.43*/routes/*22.49*/.Assets.versioned("images/favicon.png")),format.raw/*22.88*/("""">
	<div class="container-fluid" ></div>
	<title>OFM """),_display_(/*24.14*/pagename),format.raw/*24.22*/("""</title>
    </head>
    <body >

		<style>
			body """),format.raw/*29.9*/("""{"""),format.raw/*29.10*/("""
			  """),format.raw/*30.6*/("""margin: 0;
			  font-family: Arial, Helvetica, sans-serif;
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/("""
			
			"""),format.raw/*34.4*/(""".topnav """),format.raw/*34.12*/("""{"""),format.raw/*34.13*/("""
			  """),format.raw/*35.6*/("""overflow: hidden;
			  background-color: #333;
			"""),format.raw/*37.4*/("""}"""),format.raw/*37.5*/("""
			
			"""),format.raw/*39.4*/(""".topnav a """),format.raw/*39.14*/("""{"""),format.raw/*39.15*/("""
			  """),format.raw/*40.6*/("""float: left;
			  color: #f2f2f2;
			  text-align: center;
			  padding: 14px 16px;
			  text-decoration: none;
			  font-size: 17px;
			"""),format.raw/*46.4*/("""}"""),format.raw/*46.5*/("""
			
			"""),format.raw/*48.4*/(""".topnav a:hover """),format.raw/*48.20*/("""{"""),format.raw/*48.21*/("""
			  """),format.raw/*49.6*/("""background-color: #ddd;
			  color: black;
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""
			
			"""),format.raw/*53.4*/(""".topnav a.active """),format.raw/*53.21*/("""{"""),format.raw/*53.22*/("""
			  """),format.raw/*54.6*/("""background-color: #4CAF50;
			  color: white;
			"""),format.raw/*56.4*/("""}"""),format.raw/*56.5*/("""
			"""),format.raw/*57.4*/("""</style>
			</head>
			<body>
			
			<div class="topnav">
			  <a class="active" href=""""),_display_(/*62.31*/routes/*62.37*/.HomeController.index()),format.raw/*62.60*/("""">C.C.A SportsWare</a>
			  <a href=""""),_display_(/*63.16*/routes/*63.22*/.HomeController.index()),format.raw/*63.45*/("""">Home</a>
			  <a href=""""),_display_(/*64.16*/routes/*64.22*/.HomeController.onsale()),format.raw/*64.46*/("""">On Sale</a>
			  <a href=""""),_display_(/*65.16*/routes/*65.22*/.HomeController.about()),format.raw/*65.45*/("""">About us / F.A.Q</a>
			  """),_display_(/*66.7*/if(user != null)/*66.23*/ {_display_(Seq[Any](format.raw/*66.25*/("""
				"""),format.raw/*67.5*/("""<a href=""""),_display_(/*67.15*/routes/*67.21*/.LoginController.logout()),format.raw/*67.46*/("""">Log Out</a>
			""")))}/*68.6*/else/*68.11*/{_display_(Seq[Any](format.raw/*68.12*/("""
				"""),format.raw/*69.5*/("""<a href=""""),_display_(/*69.15*/routes/*69.21*/.LoginController.login()),format.raw/*69.45*/("""">Log In</a>
			""")))}),format.raw/*70.5*/("""	
			"""),format.raw/*71.4*/("""<a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a><a><div></div></a>
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
					<table style="width:100%">
						<tr>
							<th>Day</th>
							<th>Opening Hours</th>
							<th>Contacts</th> 
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
							"""),_display_(/*160.9*/content),format.raw/*160.16*/("""
						"""),format.raw/*161.7*/("""</div>
					</div>
			
			
					<table style="width:100%">
						<tr>
							<th>Day</th>
							<th>Opening Hours</th>
							<th>Contacts</th> 
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
						  <td></td>
						</tr>
						<tr>
							<td>Friday</td>
							<td>9:00-17:00</td>
						  <td></td>
						</tr>
						<tr>
							<td>Saturday</td>
							<td>12:00-20:00</td>
              <td></td>
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
	<script src=""""),_display_(/*211.16*/routes/*211.22*/.Assets.versioned("javascripts/main.js")),format.raw/*211.62*/(""""></script>
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
                  DATE: Wed Apr 17 15:45:16 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/main.scala.html
                  HASH: da7504724711f9c8686e335621106e163e04fd25
                  MATRIX: 970->1|1122->60|1212->123|1240->124|1272->130|1431->262|1459->263|1491->268|1520->270|1548->271|1592->287|1643->311|1671->312|1703->317|1985->572|2000->578|2060->617|2141->671|2170->679|2249->731|2278->732|2311->738|2400->800|2428->801|2463->809|2499->817|2528->818|2561->824|2638->874|2666->875|2701->883|2739->893|2768->894|2801->900|2965->1037|2993->1038|3028->1046|3072->1062|3101->1063|3134->1069|3207->1115|3235->1116|3270->1124|3315->1141|3344->1142|3377->1148|3453->1197|3481->1198|3512->1202|3627->1290|3642->1296|3686->1319|3751->1357|3766->1363|3810->1386|3863->1412|3878->1418|3923->1442|3979->1471|3994->1477|4038->1500|4093->1529|4118->1545|4158->1547|4190->1552|4227->1562|4242->1568|4288->1593|4324->1612|4337->1617|4376->1618|4408->1623|4445->1633|4460->1639|4505->1663|4552->1680|4584->1685|7164->4241|7193->4248|7228->4255|8182->5181|8198->5187|8260->5227
                  LINES: 28->1|33->2|37->6|37->6|38->7|43->12|43->12|44->13|44->13|44->13|46->15|47->16|47->16|48->17|53->22|53->22|53->22|55->24|55->24|60->29|60->29|61->30|63->32|63->32|65->34|65->34|65->34|66->35|68->37|68->37|70->39|70->39|70->39|71->40|77->46|77->46|79->48|79->48|79->48|80->49|82->51|82->51|84->53|84->53|84->53|85->54|87->56|87->56|88->57|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|102->71|191->160|191->160|192->161|242->211|242->211|242->211
                  -- GENERATED --
              */
          