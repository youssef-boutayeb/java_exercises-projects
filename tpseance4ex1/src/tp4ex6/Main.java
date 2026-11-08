package tp4ex6;

public class Main {
    public static void main(String[] args) {
        Voiture v = new Voiture("12345-A-1", "Dacia", 2020, 30000, 5);
        Moto m = new Moto("67890-B-2", "Yamaha", 2019, 12000, 650);
        Camion c = new Camion("11111-C-3", "Volvo", 2015, 250000, 12);

        v.rouler(150);
        m.rouler(80);
        c.rouler(500);
        c.rouler(-20);

        Vehicule[] parc = {v, m, c};
        for (Vehicule veh : parc) {
            veh.afficher();
            System.out.printf(" | vignette : %.2f DH%n", veh.calculerVignette());
        }
    }
}