import java.util.Scanner;

public class J01018 {
    static String check(char[] N) {
        int sum = N[0] - '0';
        for (int i = 1; i < N.length; ++i) {
            int m = N[i] - N[i - 1];
            if (m != 2 && m != -2)
                return "NO";
            sum += (N[i] - '0');
        }
        return (sum % 10 == 0 ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int T = buf.nextInt();
        buf.nextLine();

        while (T > 0) {
            --T;
            String N = buf.nextLine();
            System.out.println(check(N.toCharArray()));
        }
        buf.close();
    }
}
