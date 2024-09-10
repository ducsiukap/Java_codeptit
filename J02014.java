/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J02014 {
    static int balancePoint(int a[], int n) {
        int totalSum = 0;
        for (int i = 0; i < n; ++i)
            totalSum += a[i];

        if ((totalSum & 1) == 1)
            return -1;

        int leftSum = 0;
        for (int i = 0; i < n; ++i) {
            leftSum += a[i];
            if (leftSum == totalSum)
                return i + 1;
            totalSum -= a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int T = buf.nextInt();
        while (T-- > 0) {
            int n = buf.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; ++i)
                a[i] = buf.nextInt();
            System.out.println(balancePoint(a, n));
        }
        buf.close();
    }
}
