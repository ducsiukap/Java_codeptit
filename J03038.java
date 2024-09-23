import java.util.Scanner;

public class J03038 {

    static int countCharacter(String s) {
        int[] mark = new int[26];
        
        for (int i = 0; i < s.length(); ++i) 
            mark[s.charAt(i) - 'a'] = 1;
        
        int cnt = 0;
        for (int i = 0; i < 26; ++i)
            cnt += mark[i];

        return cnt;
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        System.out.println(countCharacter(buf.nextLine()));
        buf.close();
    }
}
