import java.util.Scanner;
import java.util.StringTokenizer;

public class J02037 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int T = buf.nextInt();
        buf.nextLine();
        while (T > 0) {
            --T;
            int cnt, odd;
            cnt = odd = 0;
            StringTokenizer s = new StringTokenizer(buf.nextLine());
            while (s.hasMoreTokens()) {
                int num = Integer.parseInt(s.nextToken());
                odd += (num & 1);
                ++cnt;
            }
            if ((cnt & 1) == 1)
                System.out.println(odd > (cnt - odd) ? "YES" : "NO");
            else
                System.out.println(odd < (cnt - odd) ? "YES" : "NO");
        }
        buf.close();
    }
}
