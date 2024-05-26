import java.util.ArrayList;
public class Test {
    /*
     * 1-Differente car on a pas redefinie equal()
     * 2-Egale
     * 3-Differente car le type eest pas le meme 
     * 4-Egale car on a caster
     * 5-Egale
     */
public static void main(String[] args) {
    Animal a;
    a=new Animal();
    a.crier();
    a=new Chien();
    a.crier();

    ArrayList<Animal> menagerie=new ArrayList<Animal>();
    menagerie.add(new Chien());
    menagerie.add(new Animal());
    menagerie.add(new Chat());

    for (Animal animal : menagerie)
        animal.crier();a=new Chat();
    a.manger(); //il n'y a pas de methode manger dans animal et donc il y a une erreur du compilateur

    ((Chat)a).manger(); //marche car caster
    ((Chien)a).manger();

    Chien c=new Animal(); //le type animal est incompatible pour aller dans chien
    Chien c=new Chat();   //same shit //sans les instruction mauvaise ils afficherait chacun leur methode de manger meme si tu point de vue du compilateur c pareil
    Chien c=new Chien();
    c.manger();
    c.crier();
    a=((Animal)c);
    a.crier();
}
}