/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J03025 {
    static boolean check(String s) {
        int i = 0, j = s.length() - 1;
        int diff = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                ++diff;
            ++i;
            --j;
        }
        return (diff == 1 || (diff == 0 && (s.length() & 1) == 1));
    }
    
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        
        int t = buf.nextInt();
        while (t-- > 0) {
            String s = buf.next();
            System.out.println(check(s) ? "YES" : "NO");
        }
    }
}
