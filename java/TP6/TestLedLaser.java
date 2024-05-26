public class TestLedLaser {
    public static void main(String[] args){
        LedLaser led1;
        led1 = new LedLaser(6832,false,1300.0);
        
        led1.setLongOnde(1500);
        System.out.println(led1.toString());
        led1.clignoter();
        System.out.println(led1.toString());
    }
}