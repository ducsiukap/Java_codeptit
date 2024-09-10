import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        for (int T = 1; T <= t; ++T) {
            int n = buf.nextInt();

            int[] f = new int[100001];
            int[] occur = new int[n];
            for (int i = 0; i < 100001; ++i)
                f[i] = 0;
            int x, k;
            k = 0;
            for (int i = 0; i < n; ++i) {
                x = buf.nextInt();
                if (f[x] == 0) {
                    occur[k] = x;
                    ++k;
                }
                ++f[x];
            }

            System.out.println("Test " + T + ":");
            for (int i = 0; i < k; ++i) {
                x = occur[i];
                System.out.println(x + " xuat hien " + f[x] + " lan");
            }
        }
        buf.close();
    }
}
