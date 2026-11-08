package tp4ex4;

public class Duree {
    private int heures;
    private int minutes;
    private int secondes;

    public Duree(int h, int m, int s) {
        int total = h * 3600 + m * 60 + s;
        this.heures = total / 3600;
        this.minutes = (total % 3600) / 60;
        this.secondes = total % 60;
    }

    public Duree(int h, int m) {
        this(h, m, 0);
    }

    public Duree() {
        this(0, 0, 0);
    }

    public Duree(int totalSecondes) {
        this(0, 0, totalSecondes);
    }

    public int enSecondes() {
        return heures * 3600 + minutes * 60 + secondes;
    }

    public Duree ajouter(Duree autre) {
        return new Duree(this.enSecondes() + autre.enSecondes());
    }

    public void afficher() {
        System.out.printf("%02dh%02dm%02ds%n", heures, minutes, secondes);
    }
}