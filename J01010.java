import java.util.Scanner;

public class J01010 {

    static String StringCut(char[] s){
        boolean flag = false;
        for (int i = 0; i < s.length; ++i) {
            if (s[i] == '0' || s[i] == '8' || s[i] == '9') {
                s[i] = '0';
            } else if (s[i] != '1') return "INVALID";
            else flag = true;
        }

        return (flag ? new String(s): "INVALID");
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int T = Integer.parseInt(buf.nextLine());
        while (T > 0) {
            String s = buf.nextLine();
            s = StringCut(s.toCharArray());
            s = s.replaceFirst("^0+", "");
            System.out.println(s);
            --T;
        }
        buf.close();  // Close the scanner to avoid resource leaks
    }
}