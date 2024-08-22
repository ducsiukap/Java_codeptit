/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J02008 {
    static long[] lcm = new long[101];
    static long gcd(long a, long b){
        while (b != 0) {
            long c = a;
            a = b;
            b = c % b;
        }
        return a;
    }
    
    static long getLcmOfN(int n) {
        if (n <= 2)
            return lcm[n] = n;
        else if (lcm[n] == 0)
            return lcm[n] = n * getLcmOfN(n - 1) / gcd(n, getLcmOfN(n - 1));
        return lcm[n];
    }
    
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        
        int t = buf.nextInt();
        while (t > 0) {
            --t;
            int n = buf.nextInt();
            System.out.println(getLcmOfN(n));
        }
    }
    
}
