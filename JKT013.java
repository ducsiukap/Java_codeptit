import java.io.*;
import java.util.*;

public class JKT013 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {            
            int n = sc.nextInt();
            LinkedList<String> ll = new LinkedList<>();
            ll.add("6");
            ll.add("8");
            Stack<String> st = new Stack<>();
            while (true) {
                String top = ll.poll();
                if (top.length() > n) break;
                st.add(top);
                ll.add(top + "6");
                ll.add(top + "8");
            }
            System.out.println(st.size());
            while (!st.empty())
                System.out.print(st.pop() + " ");
            System.out.println();
        }
        
        sc.close();
    }
}
