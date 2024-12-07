import java.io.*;
import java.util.*;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        
        int p[] = new int[10000];
        for (int i = 2; i < 10000; ++i) p[i] = 1;
        for (int i = 2; i <= 100; ++i) 
            if (p[i] == 1)
                for (int j = i * i; j < 10000; j += i)
                    p[j] = 0;
        
        ArrayList<Integer> al = (ArrayList<Integer>) in.readObject();
        Map<Integer, Integer> mp = new TreeMap<>();
        
        al.forEach(e->{if (p[e] == 1) 
            mp.put(e, mp.getOrDefault(e, 0) + 1);});
        mp.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
