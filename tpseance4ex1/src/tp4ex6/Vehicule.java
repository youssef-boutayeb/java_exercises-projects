package tp4ex6;

public class Vehicule {
    protected String immatriculation;
    protected String marque;
    protected int annee;
    protected int kilometrage;

    public Vehicule(String immatriculation, String marque, int annee, int kilometrage) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.annee = annee;
        this.kilometrage = kilometrage;
    }

    public void rouler(int km) {
        if (km < 0) {
            System.out.println("Distance refusée : " + km + " km");
        } else {
            kilometrage += km;
        }
    }

    public int age(int anneeCourante) {
        return anneeCourante - annee;
    }

    public void afficher() {
        System.out.printf("%s %s (%d) - %d km", immatriculation, marque, annee, kilometrage);
    }

    public double calculerVignette() {
        return 500;
    }
}