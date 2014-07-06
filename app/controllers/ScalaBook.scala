package controllers

import play.api._
import play.api.mvc._
object ScalaBook extends Controller{

	def introduction = Action{
		Ok(views.html.scala.introduction())
	}
}
