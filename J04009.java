import java.util.Scanner;

class Point2 {
    private double x, y;

    // constructor
    public Point2() { x = y = 0; }
    public Point2(double x, double y) { 
        this.x = x;
        this.y = y;
    }
    public Point2(Point2 p) { this(p.x, p.y); }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    
    public double distance(Point2 secondPoint2) {
        double X, Y;
        X = this.x - secondPoint2.x;
        Y = this.y - secondPoint2.y;
        return Math.sqrt(X * X + Y * Y);
    }

    public double distance(Point2 p1, Point2 p2) {
        double X, Y;
        X = p1.x - p2.x;
        Y = p1.y - p2.y;
        return Math.sqrt(X * X + Y * Y);
    }
}

class Triangle1 {
    private double e1, e2, e3;

    public Triangle1(double e1, double e2, double e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public boolean isTriangle1() {
        if (e1 == 0 || e2 == 0 || e3 == 0) 
            return false;
        if (e1 + e2 <= e3 || e1 + e3 <= e2 || e2 + e3 <= e1) 
            return false;
        if (Math.abs(e1 - e3) >= e2 || Math.abs(e1 - e2) >= e3 || Math.abs(e2 - e3) >= e1)
            return false;
        return true;
    }

    public double area() { 
        double p = (e1 + e2 + e3) / 2;
        return Math.sqrt(p * (p - e1) * (p - e2) * (p - e3));
    }

    @Override public String toString() {
        if (isTriangle1())
            return String.format("%.2f", area());
        return "INVALID";
    }
}

public class J04009 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        while (t-- > 0) {
            Point2[] p = new Point2[3];
            for (int i = 0; i < 3; ++i) {
                p[i] = new Point2();
                p[i].setX(buf.nextDouble());
                p[i].setY(buf.nextDouble());
            }

            Triangle1 T = new Triangle1(p[0].distance(p[1]), p[1].distance(p[2]), p[2].distance(p[0]));
            System.out.println(T.toString());
        }
        buf.close();
    }
}