import java.util.Scanner;
public class J01004 {
    public static boolean checkPrimeNumber(int n)
    {
        for (int i = 2; i * i <= n; ++i)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int T;
        T = buf.nextInt();
        while (T > 0)
        {
            int n;
            n = buf.nextInt();
            System.out.println((checkPrimeNumber(n) ? "YES" : "NO"));
            --T;
        }
    }
}
