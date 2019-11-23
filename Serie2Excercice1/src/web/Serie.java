package web;

public class Serie {
	private float somme ; 
	private int n ;
	
	public float getSomme() {
		return somme;
	}
	public void setSomme(float somme) {
		this.somme=somme;
	}
	
	public  Serie(int n) {
		this.n=n;
	}
	
	public  Serie() {
	}
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n=n;
	}
}
