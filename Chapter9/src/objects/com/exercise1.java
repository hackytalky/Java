package objects.com;

class MyPoint {
    private double x;
    private double y;

    MyPoint() {                       // no-arg: point (0, 0)
        x = 0;
        y = 0;
    }

    MyPoint(double x, double y) {     // point with given coordinates
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    // distance from THIS point to another MyPoint
    public double distance(MyPoint p) {
        double dx = p.getX() - x;
        double dy = p.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // distance from THIS point to raw coordinates
    public double distance(double x2, double y2) {
        double dx = x2 - x;
        double dy = y2 - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // TODO: static distance(MyPoint a, MyPoint b), you write this one
}

public class exercise1 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();            // (0, 0)
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println(p1.distance(p2));          // ~32.0975
        System.out.println(p1.distance(10, 30.5));    // same answer
    }
}