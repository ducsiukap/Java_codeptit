import java.util.Scanner;

class Point1 {
    private double x, y;

    // constructor
    public Point1() { x = y = 0; }
    public Point1(double x, double y) { 
        this.x = x;
        this.y = y;
    }
    public Point1(Point1 p) { this(p.x, p.y); }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    
    public double distance(Point1 secondPoint1) {
        double X, Y;
        X = this.x - secondPoint1.x;
        Y = this.y - secondPoint1.y;
        return Math.sqrt(X * X + Y * Y);
    }

    public double distance(Point1 p1, Point1 p2) {
        double X, Y;
        X = p1.x - p2.x;
        Y = p1.y - p2.y;
        return Math.sqrt(X * X + Y * Y);
    }
}

class TriangleJ04008 {
    private double e1, e2, e3;

    public TriangleJ04008(double e1, double e2, double e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public boolean isTriangleJ04008() {
        if (e1 == 0 || e2 == 0 || e3 == 0) 
            return false;
        if (e1 + e2 <= e3 || e1 + e3 <= e2 || e2 + e3 <= e1) 
            return false;
        if (Math.abs(e1 - e3) >= e2 || Math.abs(e1 - e2) >= e3 || Math.abs(e2 - e3) >= e1)
            return false;
        return true;
    }

    public double perimeter() { return (e1 + e2 + e3); }

    @Override public String toString() {
        if (isTriangleJ04008())
            return String.format("%.3f", perimeter());
        return "INVALID";
    }
}

public class J04008 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        while (t-- > 0) {
            Point1[] p = new Point1[3];
            for (int i = 0; i < 3; ++i) {
                p[i] = new Point1();
                p[i].setX(buf.nextDouble());
                p[i].setY(buf.nextDouble());
            }

            TriangleJ04008 T = new TriangleJ04008(p[0].distance(p[1]), p[1].distance(p[2]), p[2].distance(p[0]));
            System.out.println(T.toString());
        }
        buf.close();
    }
}