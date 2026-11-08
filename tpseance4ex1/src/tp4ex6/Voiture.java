package tp4ex6;

public class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String immatriculation, String marque, int annee, int kilometrage, int nombrePortes) {
        super(immatriculation, marque, annee, kilometrage);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf(" - %d portes", nombrePortes);
    }

    @Override
    public double calculerVignette() {
        return 800;
    }
}