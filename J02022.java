/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */

import java.util.Scanner;

public class J02022 {
    static int[] X = new int[11];
    static boolean[] mark = new boolean[10];

    static void reset(int n) {
        for (int i = 1; i <= n; ++i)
            mark[i] = true;
    }

    static void Try(int i, int n) {
        for (int j = 1; j <= n; ++j) {
            if (mark[j] && (Math.abs(j - X[i - 1]) != 1)) {
                X[i] = j;
                mark[j] = false;

                if (i == n) {
                    for (int t = 1; t <= n; ++t)
                        System.out.print(X[t]);
                    System.out.println();
                } else
                    Try(i + 1, n);

                mark[j] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        X[0] = -1;

        int tTest = Integer.parseInt(buf.next());
        while (tTest-- > 0) {
            int n = Integer.parseInt(buf.next());
            reset(n);
            Try(1, n);
        }
        buf.close();
    }
}