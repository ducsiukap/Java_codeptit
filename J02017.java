/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    
    static int resizeList(int[] a, int n) {
        Stack st = new Stack();
        for (int i = 0; i < n; ++i) {
            if (st.empty())
                st.push(a[i]);
            else {
                int tmp = (int)st.peek();
                tmp += a[i];
                if ((tmp & 1) == 1)
                    st.push(a[i]);
                else st.pop();
            }
        }
        return st.size();
    }
    
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        
        int n = buf.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = buf.nextInt();
        System.out.println(resizeList(a, n));
    }
}
