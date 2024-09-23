import java.util.Scanner;

public class J02028 {
    static boolean check(long[] a, int n, long k) {
        if (k == 0) {
            for (int i = 0; i < n; ++i)
                if (a[i] == 0)
                    return true;
            return false;
        }
        long res = 0;
        int i, j;
        i = j = 0;
        while (j < n) {
            res += a[j];
            while (res > k) {
                res -= a[i];
                ++i;
            }

            if (res == k)
                return true;
            ++j;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; ++i)
                a[i] = sc.nextLong();
            System.out.println(check(a, n, k) ? "YES" : "NO");
        }
        sc.close();
    }
}
