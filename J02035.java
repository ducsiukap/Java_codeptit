import java.util.Scanner;

public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; ++i)
                a[i] = sc.nextLong();
            
            long idx, min;
            idx = 0;
            min = a[0];
            for (int i = 1; i < n; ++i) {
                if (a[i] < min) {
                    idx = i;
                    min = a[i];
                }
            }
            System.out.println(idx);
        }
        sc.close();
    }
}
