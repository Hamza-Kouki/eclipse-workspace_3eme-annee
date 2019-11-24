package métier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EtudiantImpl implements IEtudiant  {
	
	private Conn cnObject;
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private int nbrow;
    
     ArrayList<Etudiant> students;
     Etudiant student;
     
    
    public EtudiantImpl(){
        
        cnObject =  new Conn();
        //ps = null;
        //rs = null;
        
  }
    
    @Override
    public ArrayList Rechercher(String name) {
        cn =  cnObject.getConn();
        
        students = new ArrayList<Etudiant>();

        
        try {

            ps=cn.prepareStatement("select * from etudiant where nom like ?");
            
            
            ps.setString(1, name);
            rs = ps.executeQuery();
            rs.last();
             nbrow =rs.getRow();
            
            if ( nbrow!=0)
            {
                rs.beforeFirst();
                
                for (int i=0;i<nbrow;i++){
                   while(rs.next()){
                       student = new Etudiant();
                       student.setId(rs.getInt(1));
                       student.setNom(rs.getString(2));
                       student.setPrenom(rs.getString(3));
                       students.add(student);
                   } 
                   
                }
                 
            }
            return students;
        }catch(Exception e){
            System.err.println("There is no students under the name \""+name+"\"");
            System.out.println("students number is  \""+nbrow+"\"");
            return null;
        }
      
    }
}
