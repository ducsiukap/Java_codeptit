import java.util.Scanner;

class Complex {
    private int a, b;
    
    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Complex add(Complex other) { return new Complex(a + other.a, b + other.b); }

    public Complex times(Complex other) {
        // (a + bi).(c + di) = a.c - b.d + (a.d - b.c)i
        Complex x = new Complex(0, 0);
        x.a = a * other.a - b * other.b;
        x.b = a * other.b + b * other.a;
        return x;
    }
    
    @Override
    public String toString() {
        if (b == 0) return Integer.toString(a);
        else if (b < 0) return (a + " - " + (-b) + "i");
        return (a + " + " + b + "i");   
    }
}

public class J04018 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();

        while (t-- > 0) {
            Complex a = new Complex(buf.nextInt(), buf.nextInt());
            Complex b = new Complex(buf.nextInt(), buf.nextInt());

            Complex c = a.add(b);

            Complex d = c.times(a);
            Complex e = c.times(c);

            System.out.println(d.toString() + ", " + e.toString());
        }
        buf.close();
    }
}
