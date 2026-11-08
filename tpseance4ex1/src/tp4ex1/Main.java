import tp4ex1.Livre;

public class Main {
    public static void main(String[] args){
        Livre L1 =new Livre("les nuits blanches","Dostoivsky",50,40);
        Livre L2 =new Livre("Le Petit Prince","Saint-Exupéry",96,50);
        Livre L3 =new Livre("Les Misérables","Victor Hugo",1900,120);
        L1.afficher();
        L2.afficher();
        L3.afficher();
        L2.appliquerRemise(50);
    }
}
