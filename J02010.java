/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */

import java.util.Scanner;

public class J02010 {
    static void directlySort(int[] a, int n) {
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (a[i] > a[j]) {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
            System.out.print("Buoc " + (i + 1) + ":");
            for (int j = 0; j < n; ++j)
                System.out.print(" " + a[j]);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        
        int n = buf.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = buf.nextInt();
        
        directlySort(a, n);
    }
}
