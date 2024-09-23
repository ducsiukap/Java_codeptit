import java.util.Scanner;
import java.util.Arrays;
public class J02016 {
    static boolean hasTripplePythagore(long[] a, int n) {
        Arrays.sort(a);
        for (int i = 0; i < n; ++i) a[i] *= a[i];
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int idx = Arrays.binarySearch(a, a[i] + a[j]);
                if (idx > 0)
                    return true;
                else {
                    idx = -idx - 1;
                    if (idx >= n)
                        break;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; ++i)
                a[i] = sc.nextLong();
            System.out.println(hasTripplePythagore(a, n) ? "YES" : "NO");
        }

        sc.close();
    }
}