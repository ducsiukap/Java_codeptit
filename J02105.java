import java.util.Scanner;

public class J02105 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int n = buf.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                a[i][j] = buf.nextInt();

        for (int i = 0; i < n; ++i) {
            System.out.printf("List(%d) =", i + 1);
            for (int j = 0; j < n; ++j)
                if (a[i][j] == 1) System.out.print(" " + (j + 1));
            System.out.println();
        }

    }
}
