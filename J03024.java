/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J03024 {

    static String check(String number) {
        if (number.charAt(0) == '0') {
            return "INVALID";
        }
        int len = number.length();
        int odd = 0;
        for (int i = 0; i < len; ++i) {
            int digit = number.charAt(i) - '0';
            if (digit < 0 || digit > 9) {
                return "INVALID";
            }
            odd += digit & 1;
        }
        if ((len & 1) == 1) {
            return (odd > (len / 2) ? "YES" : "NO");
        }
        return ((len - odd) > (len / 2) ? "YES" : "NO");

    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int t = buf.nextInt();
        while (t-- > 0) {
            String number = buf.next();
            System.out.println(check(number));
        }
    }
}
