package controllers;

import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("The online to-do list is ready."));
  }
  
}