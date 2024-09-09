/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J03032 {

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        buf.nextLine();

        while (t-- > 0) {
            String s = buf.nextLine();
            String[] A = s.split("\\s+");
            for (String w : A) {
                for (int i = w.length() - 1; i >= 0; --i) 
                    System.out.print(w.charAt(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

