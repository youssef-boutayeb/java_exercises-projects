package tp4ex5;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point autre) {
        double dx = this.x - autre.x;
        double dy = this.y - autre.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
