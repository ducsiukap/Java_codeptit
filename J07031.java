import java.util.*;
import java.io.*;

public class J07031 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int p[] = new int[1000000];
        for (int i = 2; i < 1000000; ++i) p[i] = 1;
        for (int i = 2; i <= 1000; ++i) 
            if (p[i] == 1)
                for (int j = i*i; j < 1000000; j += i)
                    p[j] = 0;
        Set<Integer> st = new HashSet<>();
        for (int i = 2; i<<1 < 1000000; ++i)
            if (p[i] == 1 && p[1000000 - i] == 1)
                st.add(i);
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> al1 = (ArrayList < Integer >) in.readObject();
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> al2 = (ArrayList < Integer >) in.readObject();
        
        Set<Integer> st1 = new TreeSet<>(), st2 = new HashSet<>(al2);
        for (int num : al1) if (st.contains(num)) st1.add(num);
        
        for (int num : st1) {
            int value = 1000000 - num;
            if (st2.contains(value))
                System.out.println(num + " " + value);
        }
    }
}