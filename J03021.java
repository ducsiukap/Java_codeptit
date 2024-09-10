/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J03021 {
    static int charCode(char c) {
        int n = c - 'A';
        if (n < 15)
            n /= 3;
        else if (n < 19)
            n = 5;
        else if (n < 22)
            n = 6;
        else
            n = 7;
        return n + 2;
    }

    static boolean check(String mess) {
        int i = 0, j = mess.length() - 1;
        while (i < j) {
            if (charCode(mess.charAt(i)) != charCode(mess.charAt(j)))
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
            String message = buf.next();
            System.out.println(check(message.toUpperCase()) ? "YES" : "NO");
        }
        buf.close();
    }
}
