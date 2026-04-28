package controllers;

import views.AuthView;

public class AuthController {
	
	private AuthView visita;
	public AuthController() {
		visita = new AuthView();
	}

	public void showLogin() {
		visita.loginView();
		
	}
}
