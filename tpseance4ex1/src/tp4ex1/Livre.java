package tp4ex1;

public class Livre {
    private String titre;
    private String auteur;
    private int nombrePages;
    private double prix;


    public Livre(String titre, String auteur, int nombrePages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("« " + titre + " » de " + auteur + ", "
                + nombrePages + " pages, "
                + String.format("%.2f", prix) + " DH"
                + (estLong() ? " (livre long)" : ""));
    }

    public boolean estLong() {
        return nombrePages > 300;
    }

    public void appliquerRemise(double pourcentage) {
        if (pourcentage < 0 || pourcentage > 50) {
            System.out.println("Remise refusée : " + pourcentage
                    + " % n'est pas autorisé.");
        } else {
            prix = prix - (prix * pourcentage / 100);
        }
    }


}


