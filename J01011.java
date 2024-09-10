import java.util.Scanner;

public class J01011 {
    static int _gcd(int a, int b) {
        while (a != 0 && b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return (b == 0 ? a : b);
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int T = buf.nextInt();
        while (T > 0) {
            --T;
            int a, b;
            a = buf.nextInt();
            b = buf.nextInt();

            int GCD = _gcd(a, b);
            long LCM = a;
            LCM *= b;
            LCM /= GCD;

            System.out.println(LCM + " " + GCD);
        }
        buf.close();
    }
}
