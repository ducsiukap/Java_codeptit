import java.util.Scanner;

public class J01021 {
    static Long powMod(int n, int p, int m)
    {
        long res = 1L;
        while (p > 0)
        {
            if ((p & 1) == 1)
            {
                res *= n;
                res %= m;
            }

            n *= n;
            n %= m;

            p >>= 1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner buf = new Scanner(System.in);

        int a, b;
        a = buf.nextInt();
        b = buf.nextInt();
        while (a != 0 || b != 0){
            System.out.println(powMod(a, b, 1000000007));
            a = buf.nextInt();
            b = buf.nextInt();
        }
    }
}
