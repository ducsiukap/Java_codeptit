import java.util.Scanner;

public class J03019 {
    static int st;

    static String maxSubStr(String s) {
        StringBuilder sb = new StringBuilder();
        char max = s.charAt(st);
        for (int i = st; i < s.length(); ++i) {
            if (s.charAt(i) == max) {
                sb.append(max);
                st = i;
            }
            else if (s.charAt(i) > max) {
                sb = new StringBuilder();
                max = s.charAt(i);
                sb.append(max);
                st = i;
            }
        }
        ++st;
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String res = "";
        st = 0;
        while (st < s.length()) {
            res += maxSubStr(s);
        }
        System.out.println(res);
        sc.close();
    }
}
