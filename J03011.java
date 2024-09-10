/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;
import java.math.BigInteger;

public class J03011 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        buf.nextLine();

        while (t-- > 0) {
            BigInteger a = new BigInteger(buf.nextLine());
            BigInteger b = new BigInteger(buf.nextLine());
            System.out.println(a.gcd(b));
        }
        buf.close();
    }
}
