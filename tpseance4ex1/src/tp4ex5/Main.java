package tp4ex5;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(new Point(1, 1), 4, 3);
        Cercle c = new Cercle(new Point(0, 0), 5);

        Point[] points = {
                new Point(2, 2),
                new Point(5, 4),
                new Point(6, 1),
                new Point(3, 4),
                new Point(0, 5)
        };

        for (Point p : points) {
            System.out.printf("(%.0f, %.0f) -> dans R : %b | dans C : %b%n",
                    p.getX(), p.getY(), r.contient(p), c.contient(p));
        }
    }
}