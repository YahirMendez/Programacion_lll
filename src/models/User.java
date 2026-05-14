package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class User {

	private int id;
    private String username;
    private String password;
    private String nombreCompleto;
    
    public User() {
        
    }
    
    public User(int id, String username, String password, String nombreCompleto)
    {
        this.id = id;
        this.username = username;
        this.password = password;
		this.nombreCompleto = nombreCompleto;
    }
    
    public ArrayList<User> get()
    {
    	ArrayList<User> users = new ArrayList<>();
    	
    	String query = "SELECT * FROM `usuarios`";
    	
    	Connection conn = null; 
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/application_db",
					"root",
					"educadex2026"
			);
			
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				User tmp = new User();
				
				tmp.setId(rs.getInt("id"));
				tmp.setUsername(rs.getString("Username"));
				tmp.setPassword(rs.getString("Password"));
				tmp.setNombreCompleto(rs.getString("Nombre_completo"));
				
				users.add(tmp);
			}
			
			rs.close();
			ps.close();
			conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	return users;
    }
    
    public boolean make(String username, String password, String nombreCompleto) {  
    	String query = "INSERT INTO usuarios (username, password, nombre_completo) VALUES (?, ?, ?)";
    	
		Connection conn = null;
		Statement stmt = null;
				
			
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	
	        conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/application_db",
	            "root",
	            "educadex2026"
	        );
	
	        PreparedStatement ps = conn.prepareStatement(query);
	        ps.setString(1, username);
	        ps.setString(2, password);
	        ps.setString(3, nombreCompleto);
	
	        int rowsAffected = ps.executeUpdate();
	        
	        if(rowsAffected >0){
		        ps.close();
		        conn.close();
	        	return true;
	        }
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    	
	    }
	    return false;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

}
