public class TestCompteBancaire{
    public static void main(String args[]){
        CompteBancaire c1;// référence vers une instance de CB
        c1= new CompteBancaire ("Slim","93",200,0);

        //System.out.println(c1.nom);
        System.out.println(c1.getSolde());
    }
}