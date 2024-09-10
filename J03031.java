import java.util.Scanner;

public class J03031 {
    static int[] mark = new int[26];

    static void reset() {
        for (int i = 0; i < 26; ++i)
            mark[i] = 0;
    }

    static boolean FullyString(String s, int k) {
        for (int i = 0; i < s.length(); ++i)
            mark[s.charAt(i) - 'a'] = 1;
        int cnt = 0;
        for (int b : mark)
            cnt += b;
        return (26 - cnt) <= k;
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int T;
        T = buf.nextInt();
        while (T > 0) {
            buf.nextLine();
            reset();

            String s;
            int k;
            s = buf.nextLine();
            k = buf.nextInt();
            System.out.println(FullyString(s, k) ? "YES" : "NO");
            --T;
        }
        buf.close();
    }
}
