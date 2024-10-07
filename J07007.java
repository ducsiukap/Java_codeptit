import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

public class J07007 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("VANBAN.in"));
            Set<String> st = new TreeSet<String>();
            while (sc.hasNext()) st.add(sc.next().toLowerCase());
            for (String w : st) System.out.println(w);
            sc.close();
        } catch (FileNotFoundException e) { }
    }
}
