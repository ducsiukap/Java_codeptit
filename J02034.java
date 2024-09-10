/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J02034 {

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int n = Integer.parseInt(buf.next());
        int[] a = new int[n];

        for (int i = 0; i < n; ++i)
            a[i] = Integer.parseInt(buf.next());

        int cur = 1;
        boolean exc = true;
        for (int i = 0; i < n; ++i) {
            if (cur < a[i]) {
                exc = false;
                while (cur < a[i]) {
                    System.out.println(cur);
                    ++cur;
                }
            }
            ++cur;
        }

        if (exc)
            System.out.println("Excellent!");
        buf.close();
    }

}
