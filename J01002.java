import java.util.Scanner;

public class J01002 {
    public static void main(String[] args)
    {
        Scanner buff = new Scanner(System.in);

        int T;
        T = buff.nextInt();
        while (T > 0)
        {
            long N;
            N = buff.nextLong();

            System.out.println(N * (N + 1) / 2);
            --T;
        }
    }
}
