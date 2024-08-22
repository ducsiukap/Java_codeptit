import java.util.Scanner;

public class J03030 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        String s = buf.nextLine();
        int n = s.length() - 1, len = 0, ans = 0;
        boolean change = false;
        while (n > -1) {
            if ((s.charAt(n) == 'B' && !change) || (s.charAt(n) == 'A' && change))
                ++len;
            else {
                if (len > 0) {
                    ++ans;
                    if (len > 1)
                        change = !change;
                    len = ((change && s.charAt(n) == 'A') || (!change && s.charAt(n) == 'B')) ? 1 : 0;
                }
            }
            --n;
//            System.out.println(len);
        }
        if (len > 0)
            ++ans;
        System.out.println(ans);
    }
}
