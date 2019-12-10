package testing;

import java.sql.*;

public class ConnexionClass {
	
	 private Connection conn ;
	 
	 public void ConnexionClass() {}
	 
	/*    public Connection getConn() {
	        return conn;
	    }*/
	    
	    public Connection Conn() {
	    	try {
	        Class.forName("com.mysql.jdbc.Driver"); 
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TravailColoborativeProject","root","");
	        
	    	} catch(Exception e)
	         {
	             System.err.println(e);    
	             
	         }
	       return conn;
	    }
	}

