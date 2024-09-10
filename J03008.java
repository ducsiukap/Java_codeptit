/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J03008 {
    static boolean isPerfectNumber(String num) {
        int i = 0, j = num.length() - 1;
        while (i <= j) {
            char c = num.charAt(i);
            if (c != num.charAt(j))
                return false;
            if ((c != '2') && (c != '3') && (c != '5') && (c != '7'))
                return false;
            ++i;
            --j;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        while (t-- > 0) {
            String num = buf.next();
            System.out.println(isPerfectNumber(num) ? "YES" : "NO");
        }
        buf.close();
    }
}
