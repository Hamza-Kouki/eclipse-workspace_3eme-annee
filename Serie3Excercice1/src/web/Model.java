package web;

import java.util.ArrayList;
import métier.Etudiant;
import métier.EtudiantImpl;

public class Model {
	
	    private Etudiant student;
	    private ArrayList<Etudiant> students;
	    private EtudiantImpl studentMethods ;
	    
	    
	    public Model(){
	         student = new Etudiant();
	         students = new ArrayList<Etudiant>();
	         studentMethods = new EtudiantImpl();
	    }


	    public void setStudentName(String student) {
	        this.student.setNom(student);
	    }

	    public ArrayList<Etudiant> getStudents() {
	        return studentMethods.Rechercher(student.getNom());
	    }

}
