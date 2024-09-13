import java.util.Scanner;

class myMath {
    public long gcd(long a, long b) {
        if (a == 0) 
            return b;
        while (b != 0) {
            long c = a;
            a = b;
            b = c % a;
        }
        return a;
    }

    public long lcm(long a, long b) { return a * b / gcd(a, b); }
}

class PhanSo {
    private long t, m;
    myMath math = new myMath();

    public PhanSo(long t, long m) {
        this.t = t;
        this.m = m;
    }

    public PhanSo addSquare(PhanSo other) {
        PhanSo x = new PhanSo(0, math.lcm(m, other.m));
        x.t = t * x.m / m + other.t * x.m / other.m;
        x.t *= x.t;
        x.m *= x.m;
        x.rutGon();
        return x;
    }

    public void rutGon() {
        long gcd = math.gcd(t, m);
        t /= gcd;
        m /= gcd;
    }

    public PhanSo mul(PhanSo a, PhanSo b) { 
        PhanSo x =  new PhanSo(t * a.t * b.t, m * a.m * b.m);
        x.rutGon();
        return x;
    }

    @Override
    public String toString() { return (t + "/" + m); }
}

public class J04014 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int t = buf.nextInt();
        while (t-- > 0) {
            PhanSo a = new PhanSo(buf.nextInt(), buf.nextInt());
            PhanSo b = new PhanSo(buf.nextInt(), buf.nextInt());

            PhanSo c = a.addSquare(b);
            PhanSo d = a.mul(b, c);
            System.out.println(c.toString() + " " + d.toString());
        }

        buf.close();
    }
}
