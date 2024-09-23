import java.util.Scanner;
public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n * 9 < k || k == 0)
            System.out.println("-1 -1");
        else {
            int[] max = new int[n];
            for (int i = 0; i < n; ++i) {
                if (k > 9) {
                    max[i] = 9;
                    k -= 9;
                }
                else {
                    max[i] = k;
                    k = 0;
                }
            }

            int[] min = new int[n];
            if (max[n - 1] == 0) {
                min[0] = 1;
                for (int i = 1; i < n; ++i) {
                    if (max[n - i - 1] != 0) {
                        min[i] = max[n - i - 1] - 1;
                        for (int j = i + 1; j < n; ++j)
                            min[j] = max[n - j - 1];
                        break;
                    }
                }
            }
            else {
                for (int i = 0, j = n - 1; i <= j; ++i, --j) {
                    min[i] = max[n - i - 1];
                    min[j] = max[n - j - 1];
                }
            }

            for (int i = 0; i < n; ++i)
                System.out.print(min[i]);
            System.out.print(' ');
            for (int i = 0; i < n; ++i)
            System.out.print(max[i]);
        }
        sc.close();
    }
}
