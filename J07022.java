import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class J07022 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            ArrayList<String> a = new ArrayList<>();
            while (sc.hasNext()) {
                String w = sc.next();
                try {
                    Integer.parseInt(w);
                } catch (NumberFormatException e) {
                    a.add(w);
                }
            }
            Collections.sort(a);
            for (String w : a) System.out.print(w + " ");
            System.out.println();

            sc.close();
        } catch (FileNotFoundException e) {
        }
    }
}