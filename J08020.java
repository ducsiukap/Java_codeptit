import java.io.*;
import java.util.*;

public class J08020 {
    static int hashFunc(char c) {
        if (c == '(') return 1;
        if (c == '[') return 2;
        if (c == '{') return 3;
        if (c == ')') return -1;
        if (c == ']') return -2;
        return -3;
    }
    static boolean isValid(String s) {
        Stack<Integer> last = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            int key = hashFunc(s.charAt(i));
            if (key > 0) last.add(key);
            else {
                if (last.empty() || last.pop() != (-key)) 
                    return false;
            }
        }
        return last.empty();
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n --> 0) 
            System.out.println(isValid(sc.next()) ? "YES" : "NO");
        sc.close();
    }
}
