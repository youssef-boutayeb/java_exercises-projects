package tp4ex6;

public class Moto extends Vehicule {
    private int cylindree;

    public Moto(String immatriculation, String marque, int annee, int kilometrage, int cylindree) {
        super(immatriculation, marque, annee, kilometrage);
        this.cylindree = cylindree;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf(" - %d cm3", cylindree);
    }

    @Override
    public double calculerVignette() {
        if (cylindree <= 125) {
            return 300;
        }
        return 600;
    }
}