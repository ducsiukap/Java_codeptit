/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J04003 {
    
    static long gcd(long a, long b) {
        if (a == 0)
            return b;
        while (b != 0) {
            long c = a; 
            a = b;
            b = c % b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        long dcm, lmm;
        dcm = buf.nextLong();
        lmm = buf.nextLong();
        long __gcd = gcd(dcm, lmm);
        System.out.println((dcm / __gcd) + "/" + (lmm / __gcd));
    }
}
