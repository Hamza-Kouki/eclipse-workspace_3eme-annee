package métier;

public class Etudiant {
  
	private int Id;
	private String nom , prenom;
	
	public Etudiant () {
		
	}
	public Etudiant (int Id , String nom , String prenom) {
		this.Id = Id; 
		this.nom = nom ; 
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
