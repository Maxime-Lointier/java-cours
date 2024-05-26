public class LedCouleur extends Led{
    private String couleur;
    public  static final String [] COULEUR = new String [4];
    static{
        COULEUR[0]="jaune";
        COULEUR[1]="rouge";
        COULEUR[2]="bleu";
        COULEUR[3]="vert";
    }
    public LedCouleur(){
        super();
        this.couleur = "rouge";
    }
    public LedCouleur(int reference,boolean etat,String couleur){
        super(reference,etat);
        int i = 0;
        for (;i<COULEUR.length;i++){
            if (couleur == COULEUR[i]){
                this.couleur= couleur;
            }
        }
        if(i == COULEUR.length){
            System.out.println("couleur invalide");
        }
    }
    public LedCouleur(LedCouleur Led){
        super(Led.getReference(),Led.getEtat());
        this.couleur= Led.getCouleur();
    }
    public String getCouleur(){
        return this.couleur;
    }
    public String toString(){
        return "couleur: "+this.couleur+"\n etat: "+this.etat+"\n reference: "+this.reference;
    }
}
