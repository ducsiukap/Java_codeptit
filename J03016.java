import java.util.Scanner;
import java.math.BigInteger;

public class J03016 {
    public static void main(String[] args) {
        BigInteger zero = new BigInteger("0");
        BigInteger el = new BigInteger("11");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            System.out.println(a.mod(el).equals(zero) ? 1 : 0);
        }
        sc.close();
    }
}
