import java.util.Scanner;

public class J03040 {
    static boolean nice(String s) {
        boolean ok1, ok2, ok3, ok4;
        ok1 = ok2 = ok3 = true;
        ok4 = (s.charAt(0) == '6' || s.charAt(0) == '8');

        for (int i = 1; i < 5; ++i) {
            char c = s.charAt(i);
            if (c <= s.charAt(i - 1))
                ok1 = false;
            if (c != '6' && c != '8')
                ok4 = false;
            if (c != s.charAt(i - 1)) {
                ok2 = false;
                if (i != 3)
                    ok3 = false;
            }
        }

        return (ok1 || ok2 || ok3 || ok4);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            s = s.substring(5, 8) + s.substring(9);
            // System.out.println(s);
            System.out.println(nice(s) ? "YES" : "NO");
        }
        sc.close();
    }
}
