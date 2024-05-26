import java.util.ArrayList;

/**
 *  utilisation de classes existantes : pour le Tp sur les listes
 *  @author Françoise GAYRAL
 */

public class TestBanque
{
  public static void main(String[] args)	{
	
	AgenceBancaire ab = new AgenceBancaire("ab","villetaneuse");
	CompteBancaire cb1 = new CompteBancaire("toto",300f,"765TR");
	CompteBancaire cb2 = new CompteBancaire("Giorno",5000000f,"19GER");
	CompteBancaire cb3 = new CompteBancaire("V",450000f,"2077J");
	CompteBancaire cb4 = new CompteBancaire("Guts",120f,"245DS");
	ab.add(cb1);
	ab.add(cb2);
	ab.add(cb3);
	ab.add(cb4);

	System.out.println(ab.comptePersonneExiste("Guts"));
   }	// fin du main
}// fin de la classe TestBanque
