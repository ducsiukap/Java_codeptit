import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        Set<String> st = new HashSet<>();
        a.forEach(s->{
            String w[] = s.trim().toLowerCase().split("\\s+");
            for (String W : w)
                st.add(W);
        });
        
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> st2 = new LinkedHashSet<>();
        while (sc.hasNext()) st2.add(sc.next().toLowerCase());
        st2.retainAll(st);
        st2.forEach(e->System.out.println(e));
    }
}
