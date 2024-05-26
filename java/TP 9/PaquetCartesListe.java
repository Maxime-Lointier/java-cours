import java.util.* ;

/**
 * gestion d'un paquet de cartes
 *
 */
 
public class PaquetCartesListe implements PaquetCartes
{

	private ArrayList cartes ;

	/**
	 * initialise un paquet de cartes vide
	 */
	 public PaquetCartesListe()
	 {

	 	       // A COMPLETER
	 }
	 // fin constructeur PaquetCartesListe
	
	
	/**
	 * retourne la chaine de caracteres representant le Paquet 
	 */
	public String toString()
	{
		return "" ; // A CHANGER
	}
   // fin methode toString
	


 
	/**
	 * melange le paquet de carte au hasard
	 */
 	public void melangerCartes()
 	{
 		int n = this.cartes.size() ;
 		
 								 // cree generateur de nombres aleatoires
 		Random r = new Random() ;   
 		
 		
		for (int i = 0 ; i < n ; i++)
	 	{
	 							// n-i places de i a n-1 sont a traiter
	 		int j = i + r.nextInt(n-i) ; 
	 		
								// permute elements de positions i et j
			Object o = this.cartes.set(i, this.cartes.get(j)) ;
			this.cartes.set(j,o) ;					
	 	}
 
 	}
   // fin methode battre

	// Completer en implementant les methodes abstraites de PaquetCartes


} // fin class PaquetCartesListe
