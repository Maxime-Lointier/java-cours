import java.util.ArrayList;
import java.util.ListIterator;

public class Bibliotheque {
    private String nom ;
    private ArrayList<Livre> livres ;

    public Bibliotheque(String unNom){
        this.nom=unNom;
        this.livres = new ArrayList<Livre>();
    }
    public void ajouterLivre(Livre livre) {
        livre.setNumero(livres.size()+1);
        livres.add(livre);

    }
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {

    }
    public Livre chercherLivre(int num) {
        for (Livre l : livres){
            if (l.getNumero() == num){
                return l;
            }
        }
        return null;
        //ListIterator<Livre> i ...
    }
    public void retirerLivre(Livre l) {
        ListIterator<Livre> i =livres.listIterator();
        while(i.hasNext()){
            Livre li = i.next();
            if(li == l){i.remove();}
        }
    }
    public void retirerLivre(int num) {
        ListIterator<Livre> i =livres.listIterator();
        while(i.hasNext()){
            Livre li = i.next();
            if(li.getNumero() == num){i.remove();}
        }
        return;
    }


    public String toString() {
        return "livres : \n"+livres;
    }

    public static void main(String[] args)
    {
        Bibliotheque batman = new Bibliotheque("batcave");
        Livre berserk = new Livre("Berserk T13","kentaro miura");
        batman.ajouterLivre(berserk);
        System.out.println(batman.toString());
    }
}
