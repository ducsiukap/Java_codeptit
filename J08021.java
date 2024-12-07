import java.io.*;
import java.util.*;

public class J08021 {
    static int maxValidString(String parentheses) {
        int len = parentheses.length();
        int mark[] = new int[len];
        Stack<Integer> last = new Stack<>();
        for (int i = 0; i < len; ++i) {
            char c = parentheses.charAt(i);
            if (c == '(')
                last.add(i);
            else if (!last.empty()) {
                mark[last.pop()] = 1;
                mark[i] = 1;
            }
        }
        
        int maxLen = 0, tmp = 0;
        for (int i = 0; i < len; ++i) {
            if (mark[i] == 1) ++tmp;
            else tmp = 0;
            maxLen = Math.max(maxLen, tmp);
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) 
            System.out.println(maxValidString(sc.next()));
        
        sc.close();
    }
}
