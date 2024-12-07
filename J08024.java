
import java.io.*;
import java.util.*;

public class J08024 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            LinkedList<Long> q = new LinkedList<>();
            q.push(9l);
            while (true) {
                long k = q.poll();
                if (k % n == 0) {
                    System.out.println(k);
                    break;
                }
                k = (k << 3) + (k << 1);
//                k = k * 10;
                q.add(k);
                q.add(k + 9);
            }
        }

        sc.close();
    }
}
