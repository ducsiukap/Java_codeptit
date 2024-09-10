import java.util.Scanner;

public class J01022 {
    static long[] fi = new long[93];

    static long getFib(int n) {
        if (n <= 2)
            return fi[n] = 1;
        if (fi[n] == 0)
            return fi[n] = getFib(n - 1) + getFib(n - 2);
        return fi[n];
    }

    static int calc(int n, long k) {
        if (n <= 2)
            return n - 1;
        else if (k <= getFib(n - 2))
            return calc(n - 2, k);
        return calc(n - 1, k - getFib(n - 2));
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int T = buf.nextInt();
        while (T > 0) {
            --T;
            int n = buf.nextInt();
            long k = buf.nextLong();
            System.out.println(calc(n, k));
        }
        buf.close();
    }
}
