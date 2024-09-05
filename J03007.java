/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J03007 {
    static boolean isPerfectNumber(String num) {
        if (num.charAt(0) != '8')
            return false;
        int i = 0, j = num.length() - 1;
        int totalSum = 0;
        while (i <= j) {
            if (num.charAt(i) != num.charAt(j))
                return false;
            int digit = num.charAt(i) - '0';
            if (i != j) digit <<= 1;
            totalSum += digit;
            ++i;
            --j;
        }
        return totalSum % 10 == 0;
    }
    
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        while (t-- > 0) {
            String num = buf.next();
            System.out.println(isPerfectNumber(num) ? "YES":"NO");
        }
    }
}
