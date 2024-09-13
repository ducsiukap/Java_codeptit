import java.util.Scanner;

class Point3 {
    private double x, y;

    // constructor
    public Point3() { x = y = 0; }
    public Point3(double x, double y) { 
        this.x = x;
        this.y = y;
    }
    public Point3(Point3 p) { this(p.x, p.y); }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    
    public double distance(Point3 secondPoint3) {
        double X, Y;
        X = this.x - secondPoint3.x;
        Y = this.y - secondPoint3.y;
        return Math.sqrt(X * X + Y * Y);
    }

    public double distance(Point3 p1, Point3 p2) {
        double X, Y;
        X = p1.x - p2.x;
        Y = p1.y - p2.y;
        return Math.sqrt(X * X + Y * Y);
    }
}

class Triangle2 {
    private double e1, e2, e3, radious;

    private void calculateRadious() { 
            double p = (e1 + e2 + e3) / 2;
            double s = Math.sqrt(p * (p - e1) * (p - e2) * (p - e3));
            radious = e1 * e2 * e3 / 4 / s;
        }

    public Triangle2(double e1, double e2, double e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public boolean isTriangle2() {
        if (e1 == 0 || e2 == 0 || e3 == 0) 
            return false;
        if (e1 + e2 <= e3 || e1 + e3 <= e2 || e2 + e3 <= e1) 
            return false;
        if (Math.abs(e1 - e3) >= e2 || Math.abs(e1 - e2) >= e3 || Math.abs(e2 - e3) >= e1)
            return false;
        return true;
    }

    public double area() { return (Math.PI * radious * radious); }

    @Override 
    public String toString() {
        if (isTriangle2()) {
            calculateRadious();
            return String.format("%.3f", area());
        }
        return "INVALID";
    }
}

public class J04010 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        while (t-- > 0) {
            Point3[] p = new Point3[3];
            for (int i = 0; i < 3; ++i) {
                p[i] = new Point3();
                p[i].setX(buf.nextDouble());
                p[i].setY(buf.nextDouble());
            }

            Triangle2 T = new Triangle2(p[0].distance(p[1]), p[1].distance(p[2]), p[2].distance(p[0]));
            System.out.println(T.toString());
        }
        buf.close();
    }
}