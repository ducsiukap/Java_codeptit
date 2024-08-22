import java.util.Scanner;

public class J01013 {
    static int n = 2000001;
    static int[] P = new int[n];

    static void lalala()
    {
        for (int i = 2; i < n; ++i)
            P[i] = 1;
        P[0] = P[1] = 0;

        for (int i = 2; i * i < n; ++i)
            if (P[i] == 1) {
                for (int j = i * i; j < n; j += i)
                    P[j] = 0;
            }

        for (int i = 2; i < n; ++i)
            if (P[i] == 0){
                int j = 2;
                while (i % j != 0) ++j;
                P[i] = j + P[i / j];
            }
            else P[i] = i;
    }

    public static void main(String[] args){
        Scanner buf = new Scanner(System.in);

        lalala();
        int n = buf.nextInt();
        long res = 0;
        while (n > 0){
            --n;
            int i = buf.nextInt();
            res += P[i];
        }
        System.out.println(res);
    }
}

