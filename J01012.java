import java.util.Scanner;

public class J01012 {
    static int CountDivisor(int N) {
        int cnt = 0;
        for (int i = 1; i * i <= N; ++i) {
            if (N % i == 0) {
                int j = N / i;
                if ((i & 1) == 0)
                    ++cnt;
                if ((j & 1) == 0 && j != i)
                    ++cnt;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int t = buf.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = buf.nextInt();
            System.out.println(CountDivisor(n));
        }
        buf.close();
    }
}
