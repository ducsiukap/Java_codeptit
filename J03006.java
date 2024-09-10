/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J03006 {
    static boolean perfectNumber(String n) {
        int i = 0, j = n.length() - 1;
        while (i < j) {
            if (n.charAt(i) != n.charAt(j) || ((n.charAt(i) - '0') & 1) == 1)
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
            System.out.println((perfectNumber(num) ? "YES" : "NO"));
        }
        buf.close();
    }
}
