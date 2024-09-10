import java.util.Scanner;

public class J01016 {
    static String check(String n) {
        int cnt = 0;
        for (int i = 0; i < n.length(); ++i)
            if (n.charAt(i) == '4' || n.charAt(i) == '7')
                ++cnt;
        return (cnt == 4 || cnt == 7) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        String s = buf.nextLine();
        System.out.println(check(s));
        buf.close();
    }
}
