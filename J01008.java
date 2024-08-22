import java.util.Scanner;

public class J01008 {

    public static void main(String[] args)
    {
        Scanner buf = new Scanner(System.in);

        int T;
        T = buf.nextInt();

        for (int i = 1; i <= T; ++i)
        {
            int n;
            n = buf.nextInt();

            System.out.print("Test " + i + ":");
            int j = 2;
            while (n > 1)
            {
                if (n % j == 0)
                {
                    int cnt = 0;
                    while (n % j == 0)
                    {
                        ++cnt;
                        n /= j;
                    }
                    System.out.print(" " + (j) + "(" + (cnt) + ")");
                }
                ++j;
            }
            System.out.println();
        }
    }
}
