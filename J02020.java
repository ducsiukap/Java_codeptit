/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */

import java.util.Scanner;

public class J02020 {

    static int cnt;

    static void Try(int[] X, int i, int n, int k) {
        for (int j = X[i - 1] + 1; j <= n - k + i; ++j) {
            X[i] = j;
            if (i == k) {
                ++cnt;
                for (int t = 1; t <= k; ++t)
                    System.out.print(X[t] + " ");
                System.out.println();
            } else
                Try(X, i + 1, n, k);
        }
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int n, k;
        n = Integer.parseInt(buf.next());
        k = Integer.parseInt(buf.next());

        int[] X = new int[k + 1];
        cnt = X[0] = 0;
        Try(X, 1, n, k);
        System.out.printf("Tong cong co %d to hop\n", cnt);
        buf.close();
    }
}
