package metier;

public class CalculSommeSerie {
	public float CalculSomme (int n) {
		float somme=0 ;
		for(int i =1 ; i<= n ; i++){
			somme+=1./i;
		}
		
		return somme ;
	}
}
