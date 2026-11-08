package tp4ex2;

public class Main {
    public static void main(String[] args) {
        CompteBancaire c1 = new CompteBancaire("C001", "Ahmed", 1000);
        CompteBancaire c2 = new CompteBancaire("C002", "Sara");
        c1.deposer(500);
        c1.retirer(200);
        c1.virerVers(c2, 300);
        System.out.println("\n--- Comptes à la fin ---");
        c1.afficher();
        c2.afficher();
    }
}