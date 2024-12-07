import java.io.*;
import java.util.*;

public class JKT014 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {            
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
            
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; ++i) {
                while (!st.empty() && a[st.peek()] <= a[i])
                    st.pop();
                if (st.empty())
                    System.out.print((i + 1) + " ");
                else System.out.print((i - st.peek()) + " ");
                st.add(i);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
