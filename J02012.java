/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;


public class J02012 {
    static void insertionSort(int[] a, int n) {
        for (int i = 0; i < n; ++i) {
            int pivot = a[i];
            for (int j = i - 1; j >= 0; --j) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                } else break;
            }
            System.out.print("Buoc " + i + ":");
            for (int j = 0; j <= i; ++j)
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
        
        insertionSort(a, n);
    }
    
}
