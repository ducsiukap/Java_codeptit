import java.util.Scanner;

public class J01006 {
    static long[] a = new long[93];

    public static long getFib(int n) {
        if (n < 3)
            return a[n] = 1;
        if (a[n] == 0)
            return a[n] = getFib(n - 1) + getFib(n - 2);
        return a[n];
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int T;
        T = buf.nextInt();
        while (T > 0) {
            int n;
            n = buf.nextInt();
            System.out.println(getFib(n));
            --T;
        }
        buf.close();
    }
}
