
public class J03027 {
    public static void main(String[] args) {
        java.util.Scanner buf  = new java.util.Scanner(System.in); 
        
        String s = buf.nextLine();
        java.util.Stack<Character> st = new java.util.Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            if (st.empty() || st.peek() != s.charAt(i))
                st.push(s.charAt(i));
            else st.pop();
        }

        if (st.empty())
            System.out.println("Empty String");
        else {
            StringBuilder sb = new StringBuilder();
            while (st.empty() == false) {
                sb.insert(0, st.pop());
            }
            System.out.println(sb);
        }

        buf.close();
    }
}
