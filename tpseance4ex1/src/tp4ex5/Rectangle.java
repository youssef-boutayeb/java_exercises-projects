package tp4ex5;

public class Rectangle {
    private Point coinHautGauche;
    private double largeur;
    private double hauteur;

    public Rectangle(Point coinHautGauche, double largeur, double hauteur) {
        this.coinHautGauche = coinHautGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double surface() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    public Point coinBasDroit() {
        return new Point(coinHautGauche.getX() + largeur, coinHautGauche.getY() + hauteur);
    }

    public boolean contient(Point p) {
        Point bd = coinBasDroit();
        return p.getX() >= coinHautGauche.getX() && p.getX() <= bd.getX()
                && p.getY() >= coinHautGauche.getY() && p.getY() <= bd.getY();
    }

    public void translater(double dx, double dy) {
        coinHautGauche = new Point(coinHautGauche.getX() + dx, coinHautGauche.getY() + dy);
    }
}