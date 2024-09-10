import java.util.Scanner;

public class J01007 {
    static long[] fib = new long[93];

    static void getFib() {
        fib[0] = fib[1] = 1;
        for (int i = 2; i < 93; ++i)
            fib[i] = fib[i - 1] + fib[i - 2];
        fib[0] = 0;
    }

    static boolean BinSearch(long x) {
        int low, high;
        low = 0;
        high = 87;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (fib[mid] == x)
                return true;
            else if (fib[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        getFib();
        int T;
        T = buf.nextInt();

        while (T > 0) {
            long x;
            x = buf.nextLong();
            System.out.println((BinSearch(x) ? "YES" : "NO"));
            --T;
        }
        buf.close();
    }
}
