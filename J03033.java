import java.util.Scanner;
import java.math.BigInteger;
public class J03033 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int t = buf.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(buf.next());
            BigInteger b = new BigInteger(buf.next());

            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
        buf.close();
    }
}
