import java.util.Scanner;

public class J02006 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int n;
        n = buf.nextInt() + buf.nextInt();

        boolean[] a = new boolean[1001];
        for (int i = 0; i < 1000; ++i)
            a[i] = false;

        for (int i = 0; i < n; ++i)
            a[buf.nextInt()] = true;

        for (int i = 0; i < 1001; ++i)
            if (a[i])
                System.out.print(i + " ");
        System.out.println();
        buf.close();
    }
}
