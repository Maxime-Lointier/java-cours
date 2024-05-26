public class Sorcier extends Personnage {
    public String[] Charme;

    public Sorcier (String nom, float PtVie,float Force, String Charme){
        super(nom, PtVie, Force);
        this.Charme = Charme;
    }
    public void ensorceler(){

    }
}