import java.util.Scanner;

public class J01024 {

    static String check(char[] n) {
        for (char i : n)
            if (i > '2')
                return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int T = buf.nextInt();
        while (T > 0) {
            T--;
            String n = buf.next();
            System.out.println(check(n.toCharArray()));
        }
        buf.close();
    }
}
