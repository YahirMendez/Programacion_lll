package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AuthModel {
	
	public AuthModel() {
		
	}
	
	public boolean access(String username, String password) throws Exception {
		
		String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
		
		System.out.println(query);
		
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

		    ResultSet rs = ps.executeQuery();
			
		    if (rs.next()) {
		    	 
		        return true;
		    }  
			
		    rs.close();
		    ps.close();
		    conn.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}

		return false; 
	}
	
	public boolean register(String username, String password, String nombre) {
	    
	    String query = "INSERT INTO usuarios (username, password, nombre_completo) VALUES (?, ?, ?)";
	
	    Connection conn = null;
	
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
	        ps.setString(3, nombre);
	
	        int result = ps.executeUpdate();
	
	        ps.close();
	        conn.close();
	
	        return result > 0;
	
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}


}
