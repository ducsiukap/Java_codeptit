import java.math.BigInteger;
import java.util.Scanner;
public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = new BigInteger("0");
            if (a.mod(b).equals(c) || b.mod(a).equals(c))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }

        sc.close();
    }
}
