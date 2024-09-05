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

public class J03009 {
    static String[] buildListWord(String a) {
        String[] word = new String[200];
        int countWord = 0;
        for (String w : a.split(" ")) {
            int hashCode = w.hashCode() % 200;
            boolean exist = false;
            while (word[hashCode] != null) {
                if (word[hashCode].equals(w)) {
                    exist = true;
                    break;
                }
                ++hashCode;
                hashCode %= 200;
            }
            if (exist == false) {
                ++countWord;
                word[hashCode] = w;
            }
        }
        String[] result = new String[countWord];
        int i = 0;
        for (String item : word) 
            if (item != null) {
                result[i] = item;
                ++i;
            }
        Arrays.sort(result);
        return result;
    }
    static void method(String a, String b) {
        String[] s1 = buildListWord(a);
        String[] s2 = buildListWord(b);
        int i, j;
        i = j = 0;
        int maxI, maxJ;
        maxI = s1.length;
        maxJ = s2.length;
        while (i < maxI) {
            if (j < maxJ) {
                int comp = s1[i].compareTo(s2[j]);
                if (comp == 0) {
                    ++i;
                    ++j;
                }
                else if (comp < 0) {
                    System.out.print(s1[i] + " ");
                    ++i;
                }
                else
                    ++j;
            }
            else {
                System.out.print(s1[i] + " ");
                ++i;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        
        int t = buf.nextInt();
        buf.nextLine();
        while (t-- > 0) {
            String a, b;
            a = buf.nextLine();
            b = buf.nextLine();
            method(a, b);
        }
    }
}
