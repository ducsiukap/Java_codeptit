/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Arrays;
import java.util.Scanner;

public class J04002 {
    static String fixString(char[] s) {
        s[0] = Character.toUpperCase(s[0]);
        return new String(s);
    }
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        long w, h;
        String color;
        w = Long.parseLong(buf.next());
        h = Long.parseLong(buf.next());
        color = buf.next();
        if (w <= 0 || h <= 0) 
            System.out.println("INVALID");
        else {
            color= color.toLowerCase();
            color = fixString(color.toCharArray());
            System.out.print(2 * (w + h));
            System.out.println(" " + (w * h) + " " + color);
        }
    }
}
