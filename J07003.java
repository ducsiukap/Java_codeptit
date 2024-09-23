import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;

public class J07003 {
    static void cc(String s) {
        if (s.length() == 1)
            return;
        BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
        BigInteger b = new BigInteger(s.substring(s.length() / 2));
        BigInteger c = a.add(b);
        System.out.println(c);
        cc(c.toString());
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));  
        String s = sc.nextLine();
        cc(s);
        sc.close();
    }
}
