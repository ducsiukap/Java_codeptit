import java.io.*;
import java.util.*;

public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream d = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> mp = new TreeMap<>();
        for (int i = 0; i < 100000; ++i) {
            int num = d.readInt();
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        mp.forEach((k, v) -> System.out.printf("%d %d\n", k, v));
    }
}
