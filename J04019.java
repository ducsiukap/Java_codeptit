import java.util.Scanner;

class PointJ04019 {
    private double x, y;

    public PointJ04019(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static public PointJ04019 nextPointJ04019(Scanner buf) {
        return new PointJ04019(buf.nextDouble(), buf.nextDouble());
    }

    public double distance(PointJ04019 other) {
        double X = x - other.x;
        double Y = y - other.y;
        return Math.sqrt(X * X + Y * Y);
    }
}

class Triangle {
    private PointJ04019 p1, p2, p3;
    private double e1, e2, e3;

    public Triangle(PointJ04019 p1, PointJ04019 p2, PointJ04019 p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        e1 = this.p1.distance(this.p2);
        e2 = this.p2.distance(this.p3);
        e3 = this.p3.distance(this.p1);
    }

    public boolean valid() {
        if (e1 == 0 || e2 == 0 || e3 == 0)
            return false;

        if (e1 + e3 <= e3 || e1 + e3 <= e2 || e2 + e3 <= e1)
            return false;

        if (Math.abs(e1 - e2) >= e3 || Math.abs(e1 - e3) >= e2 || Math.abs(e2 - e3) >= e1)
            return false;

        return true;
    }

    public String getPerimeter() { 
        double p = e1 + e2 + e3;
        return String.format("%.3f", p);
    }
}

public class J04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(PointJ04019.nextPointJ04019(sc), PointJ04019.nextPointJ04019(sc), PointJ04019.nextPointJ04019(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}
