/**Fichier AgenceBancaire.java
* utilisation de classe Java ArrayList
*/
   import java.util.*;

   public class AgenceBancaire {
      private String nomAgence; 	//nom de l'agence
      private String ville; //adresse de l'agence

      private ArrayList<CompteBancaire> ComptesBancaires; // ensembles des comptes bancaires de l'agence


   /**
   * Constructeur
   */

      public AgenceBancaire(String nom,String adresse){
         this.nomAgence = nom;
         this.ville = adresse;
         ComptesBancaires = new ArrayList<CompteBancaire>();
      }



   /* pour affichage ***************************************************/

       public String toString() {
         return "liste de compte bancaire: \n"+ComptesBancaires;
	}

   /* Gestion des comptes *****************************************/
   public void add(CompteBancaire cb)  {
      ComptesBancaires.add(cb);
	}


      public boolean compteExiste(CompteBancaire cb)  {
         return ComptesBancaires.contains(cb);
      }

      public boolean comptePersonneExiste(String nom){
         for (CompteBancaire n:ComptesBancaires){
            if (n.getNom() ==nom){return true;}
         }
         return false;
      }

      public ArrayList<CompteBancaire> lesComptesDe(String nom)  {
         ArrayList<CompteBancaire> comptesNom= new ArrayList<CompteBancaire>();
         for(CompteBancaire c:ComptesBancaires){
            if(c.getNom()== nom){comptesNom.add(c);}
         }
         return comptesNom;
      }


   //test de la classe************


   }//fin classe
