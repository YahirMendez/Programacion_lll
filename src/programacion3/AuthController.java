package programacion3;

public class AuthController {
	
	private AuthView visita;
	public AuthController() {
		visita = new AuthView();
	}

	public void showLogin() {
		visita.loginView();
		
	}
}
