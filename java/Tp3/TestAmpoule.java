public class TestAmpoule{
    public static void main(String[] args){
        Ampoule ampoule1;
        Ampoule ampoule2;
        ampoule1 = new Ampoule(3500,500);
        ampoule2 = new Ampoule(5000,1000);
        System.out.println(ampoule1.getCouleur()+"k");
        int i;
        i=0;
        while (i<10){
            ampoule1.allumer();
            ampoule1.eteindre();
            ampoule2.allumer();
            ampoule2.eteindre();
            i+=1;
        }
    }
}