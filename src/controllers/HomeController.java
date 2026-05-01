package controllers;

import views.AuthView;
import views.HomeView;

public class HomeController {

	private HomeView visita;
	
	public HomeController() {
		visita = new HomeView();
	}
	
	public void showHome() {
		visita.HomeView();
		
	}
}
