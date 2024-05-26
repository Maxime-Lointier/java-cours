public class CompteBancaire{
    private String nom;
    private String numero;
    private Float solde;
    //constructeurs
public CompteBancaire(String nomC,String numeroC,Float depot){
    this.nom = nomC;
    this.numero = numeroC;
    this.solde = depot;
}
public CompteBancaire (String nomC,String numeroC){
   this.nom = nomC;
    this.numero = numeroC;
}
    //methodes
public void afficher (){
    System.out.println("proprio"+this.nom+"numero"+this.numero+"solde"+this.solde);
}
public Float vider (){
    Float montant = this.solde;
    this.solde = 0,0;
    return montant;
}
//getter setter
public String getNom(){
    return this.nom;
}
public String getNumero(){
    return this.numero;
}
public Float getSolde(){
    return this.solde;
}
public void setNom(String nom){
    this.nom=nom;
}
public void setNumero(String numero){
    this.numero=numero;
}
public void setSolde(Float numero){
    this.solde=solde;
}
public String toString(){
    return this.numero+"\t"+this.nom+" :"+this.solde;
}
public boolean ajout(Float montant){
    if (montant <= 0)
        return false;
    this.solde += montant    
    return true;
    
}
}