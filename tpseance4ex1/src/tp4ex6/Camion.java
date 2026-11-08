package tp4ex6;

public class Camion extends Vehicule {
    private double chargeMaxTonnes;

    public Camion(String immatriculation, String marque, int annee, int kilometrage, double chargeMaxTonnes) {
        super(immatriculation, marque, annee, kilometrage);
        this.chargeMaxTonnes = chargeMaxTonnes;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf(" - charge max : %.1f t", chargeMaxTonnes);
    }

    @Override
    public double calculerVignette() {
        return 1000 + 200 * chargeMaxTonnes;
    }
}