/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J02013 {
    
    static void bubleSort(int[] a, int n) {
        for (int i = 0; i < n; ++i) {
            boolean ok = true;
            for (int j = 1; j < n; ++j) {
                if (a[j] < a[j - 1]) {
                    ok = false;
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
            
            if (ok) break;
            else {
                System.out.print("Buoc " + (i + 1) + ":");
                for (int j = 0; j < n; ++j)
                    System.out.print(" " + a[j]);
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        
        int n = buf.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = buf.nextInt();
        
        bubleSort(a, n);
    }
}
