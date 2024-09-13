import java.util.Scanner;

class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    static public boolean check(Point3D a, Point3D b, Point3D c, Point3D d) {
        Point3D vectorAB = new Point3D(a.x - b.x, a.y - b.y, a.z - b.z);
        Point3D vectorAC = new Point3D(a.x - c.x, a.y - c.y, a.z - c.z);
        Point3D vectorAD = new Point3D(a.x - d.x, a.y - d.y, a.z - d.z);

        long X = vectorAB.y * vectorAC.z - vectorAB.z * vectorAC.y;
        long Y = vectorAB.z * vectorAC.x - vectorAB.x * vectorAC.z;
        long Z = vectorAB.x * vectorAC.y - vectorAB.y * vectorAC.x;

        return ((X * vectorAD.x + Y * vectorAD.y + Z * vectorAD.z) == 0);
    }
}

public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
