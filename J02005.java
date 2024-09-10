import java.util.Scanner;

public class J02005 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int n, m, x;
        n = buf.nextInt();
        m = buf.nextInt();

        boolean[] a = new boolean[1001];
        boolean[] b = new boolean[1001];
        for (int i = 0; i < 1000; ++i){
            a[i] = false;
            b[i] = false;
        }

        for (int i = 0; i < n; ++i){
            x = buf.nextInt();
            a[x] = true;
        }
        for (int i = 0; i < m; ++i){
            x = buf.nextInt();
            b[x] = true;
        }

        for (int i = 0; i < 1001; ++i)
            if (a[i] && b[i])
                System.out.print(i + " ");
        System.out.println();
        buf.close();
    }
}
