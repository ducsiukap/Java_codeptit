import java.util.StringTokenizer;
import java.util.Scanner;

public class J03004 {
    static void chuanHoa(char[] s) {
        System.out.print(Character.toUpperCase(s[0]));
        for (int i = 1; i < s.length; ++i)
            System.out.print(s[i]);
        System.out.print(" ");
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int t = buf.nextInt();
        buf.nextLine();
        while (t-- > 0) {
            StringTokenizer s = new StringTokenizer(buf.nextLine());
            while (s.hasMoreTokens()) {
                String word = s.nextToken();
                chuanHoa(word.toLowerCase().toCharArray());
            }
            System.out.println();
        }
        buf.close();
    }
}