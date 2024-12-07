import java.io.*;
import java.util.*;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream d = new ObjectInputStream(new FileInputStream("DATA.in"));
        Map<Integer, Integer> mp = new TreeMap<>();
        ArrayList<Integer> al = (ArrayList<Integer>) d.readObject();
        al.forEach(e -> mp.put(e, mp.getOrDefault(e, 0) + 1));
        mp.forEach((k, v) -> System.out.printf("%d %d\n", k, v));
    }
}
