/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;

public class J03013 {
    static void absoluteMinus(String x, String y) {
        int i = x.length() - 1, j = y.length() - 1;
        int[] m = new int[i + 1];
        int carry, k;
        carry = 0;
        k = -1;
        while (j >= 0) {
            int M = x.charAt(i) - y.charAt(j) - carry;
            --i;
            --j;
            if (M < 0) {
                M += 10;
                carry = 1;
            } else
                carry = 0;
            ++k;
            m[k] = M;
        }
        while (i >= 0) {
            int M = x.charAt(i) - '0' - carry;
            --i;
            if (M < 0)
                M += 10;
            else
                carry = 0;
            ++k;
            m[k] = M;
        }

        // while (m[k] == 0) --k;
        while (k >= 0) {
            System.out.print(m[k]);
            --k;
        }
        System.out.println();
    }

    static int numberCompare(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n == m) {
            for (int i = 0; i < n; ++i) {
                if (s1.charAt(i) < s2.charAt(i))
                    return -1;
                if (s1.charAt(i) > s2.charAt(i))
                    return 1;
            }
            return 0;
        }
        return (n > m ? 1 : -1);
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        while (t-- > 0) {
            String a, b;
            a = buf.next();
            b = buf.next();
            int comp = numberCompare(a, b);
            if (comp == 0) {
                for (int i = 0; i < a.length(); ++i)
                    System.out.print(0);
                System.out.println();
            } else if (comp == 1)
                absoluteMinus(a, b);
            else
                absoluteMinus(b, a);
        }
        buf.close();
    }
}
