
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.ItemOnSale],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.ItemOnSale], categories: List[models.Category], user: models.users.User,env:play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.119*/("""
"""),_display_(/*2.2*/main("On Sale", user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
	"""),format.raw/*3.2*/("""<h1>On sale here</h1>

	"""),format.raw/*5.71*/("""
	"""),_display_(/*6.3*/if(flash.containsKey("success"))/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
		"""),format.raw/*7.3*/("""<div class="alert alert-success">
			"""),_display_(/*8.5*/flash/*8.10*/.get("success")),format.raw/*8.25*/("""
		"""),format.raw/*9.3*/("""</div>
	""")))}),format.raw/*10.3*/("""
   
	"""),format.raw/*12.2*/("""<div class="col-sm-3">
		<h4>Categories</h4>
		<div class="list-group">
			<a href=""""),_display_(/*15.14*/routes/*15.20*/.HomeController.onsale(0)),format.raw/*15.45*/("""" class="list-group-item">All categories</a>
			"""),_display_(/*16.5*/for(c<-categories) yield /*16.23*/ {_display_(Seq[Any](format.raw/*16.25*/("""
				"""),format.raw/*17.5*/("""<a href=""""),_display_(/*17.15*/routes/*17.21*/.HomeController.onsale(c.getId)),format.raw/*17.52*/("""" class="list-group-item catheight">"""),_display_(/*17.89*/c/*17.90*/.getName),format.raw/*17.98*/("""
					"""),format.raw/*18.6*/("""<span class="badge">"""),_display_(/*18.27*/c/*18.28*/.getItems.size),format.raw/*18.42*/("""</span>
				</a>
			""")))}),format.raw/*20.5*/("""
		"""),format.raw/*21.3*/("""</div>
	</div>

	<div class="col-sm-9">
		<h4>Note that all products are second hand, unless otherwise stated.</h4>
		<table class="table table-bordered table-hover table-condensed">
			<thead>
				<!-- The header row-->
				<tr>
					<th style=color:#333;>Image</th>
					<th style=color:#333;>ID</th>
					<th style=color:#333;>Name</th>
					<th style=color:#333;>Category</th>
					<th style=color:#333;>Description</th>
					<th style=color:#333;>Stock</th>
					<th style=color:#333;>Price</th>
				</tr>
			</thead>
			<tbody>
				"""),format.raw/*40.60*/("""
				"""),_display_(/*41.6*/for(i<-items) yield /*41.19*/ {_display_(Seq[Any](format.raw/*41.21*/("""
					"""),format.raw/*42.6*/("""<tr>
						"""),_display_(/*43.8*/if(env.resource("public/images/productImages/" + i.getId + ".jpg").isDefined)/*43.85*/{_display_(Seq[Any](format.raw/*43.86*/("""
							"""),format.raw/*44.8*/("""<td><img src="/assets/images/productImages/Thumbnails/"""),_display_(/*44.63*/(i.getId + ".jpg")),format.raw/*44.81*/(""""/></td>
                          """)))}/*45.29*/else/*45.34*/{_display_(Seq[Any](format.raw/*45.35*/("""
							  """),format.raw/*46.10*/("""<td><img src="/assets/images/productImages/Thumbnails/noImage.jpg"/></td>
						  """)))}),format.raw/*47.10*/("""
						"""),format.raw/*48.7*/("""<td>"""),_display_(/*48.12*/i/*48.13*/.getId),format.raw/*48.19*/("""</td>
						<td>"""),_display_(/*49.12*/i/*49.13*/.getName),format.raw/*49.21*/("""</td>
						<td>"""),_display_(/*50.12*/i/*50.13*/.getCategory.getName),format.raw/*50.33*/("""</td>
						<td>"""),_display_(/*51.12*/i/*51.13*/.getDescription),format.raw/*51.28*/("""</td>
						<td>"""),_display_(/*52.12*/i/*52.13*/.getStock),format.raw/*52.22*/("""</td>
						<td>&euro; """),_display_(/*53.19*/("%.2f".format(i.getPrice))),format.raw/*53.46*/("""</td>
						<!-- Update button -->
						<td>
							<a href=""""),_display_(/*56.18*/routes/*56.24*/.HomeController.updateItem(i.getId)),format.raw/*56.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
						</td>
						<!-- Delete button -->
						<td>
							<a href=""""),_display_(/*62.18*/routes/*62.24*/.HomeController.deleteItem(i.getId)),format.raw/*62.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
						</td>
					</tr>
				""")))}),format.raw/*67.6*/("""
			"""),format.raw/*68.4*/("""</tbody>
		</table>
		<p>
			<a href=""""),_display_(/*71.14*/routes/*71.20*/.HomeController.addItem()),format.raw/*71.45*/("""">
				<button class="btn btn-primary">Add an item</button>
			</a>
		</p>
	</div>
""")))}),format.raw/*76.2*/("""	



"""))
      }
    }
  }

  def render(items:List[models.ItemOnSale],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(items,categories,user,env)

  def f:((List[models.ItemOnSale],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (items,categories,user,env) => apply(items,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 13:22:26 IST 2019
                  SOURCE: /home/wdd/ProjectYear2/app/views/onsale.scala.html
                  HASH: 8cabcce9a04d3fe0012e95940f433a2f2a90d458
                  MATRIX: 1027->1|1240->118|1268->121|1297->142|1335->143|1364->146|1417->241|1446->245|1486->277|1525->279|1555->283|1619->322|1632->327|1667->342|1697->346|1737->356|1772->364|1887->452|1902->458|1948->483|2024->533|2058->551|2098->553|2131->559|2168->569|2183->575|2235->606|2299->643|2309->644|2338->652|2372->659|2420->680|2430->681|2465->695|2518->718|2549->722|3134->1334|3167->1341|3196->1354|3236->1356|3270->1363|3309->1376|3395->1453|3434->1454|3470->1463|3552->1518|3591->1536|3647->1574|3660->1579|3699->1580|3738->1591|3853->1675|3888->1683|3920->1688|3930->1689|3957->1695|4002->1713|4012->1714|4041->1722|4086->1740|4096->1741|4137->1761|4182->1779|4192->1780|4228->1795|4273->1813|4283->1814|4313->1823|4365->1848|4413->1875|4506->1941|4521->1947|4577->1982|4780->2158|4795->2164|4851->2199|5045->2363|5077->2368|5146->2410|5161->2416|5207->2441|5326->2530
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|42->10|44->12|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|72->40|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|79->47|80->48|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|88->56|88->56|88->56|94->62|94->62|94->62|99->67|100->68|103->71|103->71|103->71|108->76
                  -- GENERATED --
              */
          