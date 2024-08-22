import java.util.Scanner;

public class J02004 {
    static String check(int [] a, int n){
        for (int i = 0; i < (n >> 1); ++i)
            if (a[i] != a[n - 1 - i])
                return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int t = buf.nextInt();
        while (t-- > 0) {
            int n = buf.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i)
                a[i] = buf.nextInt();
            System.out.println(check(a, n));
        }
    }
}
