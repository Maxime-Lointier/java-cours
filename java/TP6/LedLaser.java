public class LedLaser extends Led {
    public static final double LONG_MINI = 1000;
    public static final double LONG_MAXI = 2000;
    private double longOnde;

    public LedLaser(){
        super();
        this.longOnde=1500;
    }
    public LedLaser(int reference,boolean etat,double longOnde){
        super(reference,etat);
        if (LedLaser.isValide(longOnde)){
            this.longOnde = longOnde;
        }
        else{System.out.println("valeur longueur onde incorecte");}
    }
    public LedLaser(LedLaser LedL){
        super(LedL);
        this.longOnde = LedL.getLongOnde();
    }

    public static boolean isValide(double longOnde){
        if(longOnde>LedLaser.LONG_MINI && longOnde < LedLaser.LONG_MAXI){
            return true;
        }
        else{return false;}
    }
    public double getLongOnde(){
        return this.longOnde;
    }
    public void setLongOnde(double longOnde){
        if(isValide(longOnde)){
            this.longOnde = longOnde;
        }
        else{System.out.println("longueur d'onde incorecte");}
    }
    public String toString(){
        return("etat: "+this.etat+"\n longueur onde : "+this.longOnde+"\n ref : "+this.reference);
    }
}