import java.util.Scanner;

public class J02101 {
    static void printMatrix(int[] a, int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j)
                System.out.print(a[i * n + j] + " ");
            ++i;
            if (i < n)
                for (int j = n - 1; j >= 0; --j)
                    System.out.print(a[i * n + j] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int m = n * n;
            int[] arr = new int[m];
            for (int i = 0; i < m; ++i)
                arr[i] = in.nextInt();
            printMatrix(arr, n);
            System.out.println();
        }
        in.close();
    }
}
