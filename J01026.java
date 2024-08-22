import java.util.Scanner;
public class J01026 {

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int t = buf.nextInt();
        while (t-- > 0)
        {
            int n = buf.nextInt();
            int sq = (int)Math.sqrt(n);
            System.out.println(sq * sq == n ? "YES" : "NO");
        }
    }
}
