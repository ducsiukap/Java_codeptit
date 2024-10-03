import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long ans = 0;
        while (sc.hasNext()) {
            try { ans += Integer.parseInt(sc.next()); }
            catch(NumberFormatException e) {}
        }
        System.out.println( ans);
        sc.close();
    }
}
