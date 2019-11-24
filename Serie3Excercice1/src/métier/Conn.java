package métier;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conn {
	
    private Connection conn ;

    public Connection getConn() {
        return conn;
    }
    
     public Conn() {
         

    try {

        Class.forName("com.mysql.jdbc.Driver"); 
    this.conn =   DriverManager.getConnection("jdbc:mysql://localhost:3306/db_gestion?zeroDateTimeBehavior=convertToNull","root","0wq8a6tt");
    
    System.out.println("Successfull Connection To Your DataBase : \n");
    System.out.println("Current database is : \"db_gestion\" => 'etudiant' .");
    
    
         }catch(Exception e)
         {
             System.err.println(e);    
             
         }
     }
}
