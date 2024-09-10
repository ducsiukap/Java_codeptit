/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J04004 {
    static long __gcd(long a, long b) {
        if (a == 0)
            return b;
        while (b != 0) {
            long c = a;
            a = b;
            b = c % b;
        }
        return a;
    }

    static long __lcm(long a, long b) {
        return a * b / __gcd(a, b);
    };

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t1, t2, m1, m2;
        t1 = buf.nextInt();
        m1 = buf.nextInt();
        t2 = buf.nextInt();
        m2 = buf.nextInt();
        long M = __lcm(m1, m2);
        long T = M / m1 * t1 + M / m2 * t2;

        long gcd = __gcd(T, M);
        System.out.println((T / gcd) + "/" + (M / gcd));
        buf.close();
    }
}
