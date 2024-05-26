/**
 *  utilisation de classes existantes
 *  @author Françoise GAYRAL
 */

import java.util.*;
public class TestUtilisationClasses
{
  public static void main(String[] args)	{
	// Pour l'exo 2 sur les chaînes : utilisation de la classe String
	String sb = "Bonjour tout le monde ";
	String m = new String("monde");
	String mb = "    monde        "; //4 blancs au départ, 8 blancs à la fin
	String me = "et merci";
	//String sbminus = sb.toLowerCase();
	//System.out.println(sbminus);
	//System.out.println(m.length());
	/*System.out.print(m.charAt(0));
	for(int i=1; i< m.length();i++){
		System.out.print("-"+m.charAt(i));
	}
	System.out.println();
	*/
	/*
	if (m.equals(mb)){
		System.out.println("=");
	
	}
	else {
		System.out.println("!=");

	}
	*/
	/*
	if (sb.endsWith("m")){
		System.out.println("oui");

	
	}
	else{
		System.out.println("no");
	}
	*/
	/*
	if (sb.indexOf(m)>=0){
		System.out.println("contient m");

	}
	else{
		System.out.println("ne contient pas m");
	}
	*/
	//scanner est une classe qui permet de lire le clavier comme un input ex : Scanner sc = new scanner(system.in);
	/*
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	System.out.println("vous avez saisie "+str);
	*/

   }	// fin du main
}// fin de la classe TestUtilisationClasses
