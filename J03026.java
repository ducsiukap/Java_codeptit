/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J03026 {

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int t = buf.nextInt();
        while (t-- > 0) {
            String a, b;
            a = buf.next();
            b = buf.next();
            if (a.equals(b)) {
                System.out.println(-1);
            } else {
                System.out.println(Math.max(a.length(), b.length()));
            }
        }
    }
}
