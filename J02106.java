import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int n = buf.nextInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < 3; ++j)
                a[i][j] = buf.nextInt();

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int tmp = 0;
            for (int j = 0; j < 3; ++j)
                tmp += a[i][j];
            if (tmp > 1)
                ++ans;
        }
        System.out.println(ans);
        buf.close();
    }
}
