package controllers;

import java.util.ArrayList;

import models.User;
import views.UsersView;

public class UsersController {
	
	private UsersView view;
	private User model;
	
	
	public UsersController() {
		view= new UsersView();
		model= new User();
	}

	public void ShowUsers() {
		ArrayList<User> users=  model.get();
		view.tableUsers(users);
	}
	
	public boolean addUser(String u, String p, String n) {
		boolean flag = model.make(u, p, n);
		return flag;
	}
}
