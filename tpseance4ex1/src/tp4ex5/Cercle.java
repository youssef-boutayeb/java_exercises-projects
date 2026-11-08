package tp4ex5;

public class Cercle {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public boolean contient(Point p) {
        return centre.distance(p) <= rayon;
    }
}