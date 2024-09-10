/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J01014 {

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int t = buf.nextInt();
        while (t-- > 0) {
            long n = buf.nextLong();

            long ans = 1;
            if ((n & 1) == 0) {
                ans = 2;
                while ((n & 1) == 0) {
                    n >>= 1;
                }
            }
            for (long i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    ans = i;
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
            System.out.println(Math.max(n, ans));
        }
        buf.close();
    }
}
