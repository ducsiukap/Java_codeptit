import java.util.Scanner;
public class J02103 {
    static void matrixMultiply(int[][] m1, int[][] m2, int n, int m) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                long tmp = 0;
                for (int k = 0; k < m; ++k)
                    tmp += 1L * m1[i][k] * m2[k][j];
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        for (int k = 1; k <= t; ++k) {
            int n = buf.nextInt();
            int m = buf.nextInt();
            int[][] matrix = new int[n][m];
            int[][] transform = new int[m][n];
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j) {
                    matrix[i][j] = buf.nextInt();
                    transform[j][i] = matrix[i][j];
                }
            System.out.println("Test " + k + ":");
            matrixMultiply(matrix, transform, n, m);
        }
    }
}
