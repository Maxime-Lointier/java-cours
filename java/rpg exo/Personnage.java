public class Personnage {
public String Nom;
public float PtVie;
public float Force;

public Personnage (String nom, float PtVie, float Force){
    this.Nom = nom;
    this.PtVie= PtVie;
    this.Force = Force;
}
public void attaque(Personnage p){
    p.PtVie=p.PtVie - (5 * this.Force;)
}
}