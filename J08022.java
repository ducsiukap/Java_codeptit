import java.io.*;
import java.util.*;

public class J08022 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {            
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
            
            Stack<Integer> st = new Stack<>();
            int r[] = new int[n];
            for (int i = n - 1; i > -1; --i) {
                while (!st.empty() && st.peek() <= a[i])
                    st.pop();
                if (st.empty())
                    r[i] = -1;
                else r[i] = st.peek();
                st.push(a[i]);
            }
            
            for (int i = 0; i < n; ++i) 
                System.out.print(r[i] + " ");
            System.out.println();
        }
        
        sc.close();
    }
}
