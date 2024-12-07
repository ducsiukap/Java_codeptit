import java.io.*;
import java.util.*;

public class J07029 {
    
    static boolean isPrime(int n) {
        for (int i = 2; i *i <= n; ++i) 
            if (n % i == 0) return false;
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        
        ArrayList<Integer> al = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        ArrayList<Integer> keys = new ArrayList<>();
        al.forEach(e->{
            if (isPrime(e)) 
                if (mp.get(e) == null) {
                    mp.put(e, 1);
                    keys.add(e);
                }
                else mp.put(e, mp.get(e) + 1);
        });
        keys.sort((e1, e2) -> e2 - e1);
        for (int i = 0; i < 10; ++i) 
            System.out.println(keys.get(i) + " " + mp.get(keys.get(i)));
    }
}