package métier;

import java.util.ArrayList;

public class Test {
	private static ArrayList<Etudiant> students;
	private static EtudiantImpl test;
	
	public static void main(String[] args)
    {
        students = new ArrayList<Etudiant>();
         test = new EtudiantImpl();
        students = test.Rechercher("Kouki");
        System.out.println("there is "+students.size()+" students with that name");
         System.out.println("the last name of the selected student is  "+students.get(0).getPrenom());
    }
}
