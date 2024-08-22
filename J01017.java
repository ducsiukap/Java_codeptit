import java.util.Scanner;


public class J01017 {

    static String check(char[] n){
        for (int i = 0; i < n.length - 1; ++i){
            char a = n[i];
            char b = n[i + 1];
//            System.out.print(a - b);
            if ((a - b  != 1) && (a - b != -1))
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
        Scanner buf = new Scanner(System.in);

//        int T = Integer.parseInt(buf.nextLine());
        int T = buf.nextInt();
        buf.nextLine();
        while (T > 0){
            --T;
            String N = buf.nextLine();
            System.out.println(check(N.toCharArray()));
        }
    }
}