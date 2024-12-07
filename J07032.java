import java.io.*;
import java.util.*;

public class J07032 {
    static boolean isTN(int num) {
        String n = Integer.toString(num);
        int len = n.length();
        if ((len&1) == 0 || len < 3) return false;
        for (int i = 0; (i<<1) < len; ++i) 
            if (n.charAt(i) != n.charAt(len - i - 1) ||
                   (Character.getNumericValue(n.charAt(i))&1) == 0) 
                return false;
        return true;
    }
    static int cnt;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> al1 = (ArrayList<Integer>) in.readObject();
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> al2 = (ArrayList<Integer>) in.readObject();
        in.close();
        Map<Integer, Integer> mp1 = new TreeMap<>(), mp2 = new TreeMap<>();
        al1.forEach(e-> mp1.put(e, mp1.getOrDefault(e, 0) + 1));
        al2.forEach(e-> mp2.put(e, mp2.getOrDefault(e, 0) + 1));
        cnt = 10;
        mp1.forEach((k, v) -> {
            if (cnt == 0) return;
            if (mp2.get(k) != null && isTN(k)) {
                --cnt;
                System.out.println(k + " " + (v + mp2.get(k)));
            }
        });
    }
}
