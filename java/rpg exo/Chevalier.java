public class Chevalier extends Personnage {
    public String[] armes;
    public Chevalier (String nom, float PtVie, float Force, String arme){
        super(nom,PtVie,Force);
        this.armes.add(arme);
    }
    public attaque (Personnage p,String armes){
        p.PtVie -= 5*this.Force;
        if (this.armes.contains(arme)){
            if (this.arme.length == 1){
                p.PtVie -= 5*this.Force;
            }
            if (this.arme.length == 2){
                p.PtVie -= 10*this.Force;
            }
            if (this.arme.length =>3){
                p.PtVie -= 15*this.Force;
            }
        }
    }
    
}
