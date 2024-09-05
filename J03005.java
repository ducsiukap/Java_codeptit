/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.StringTokenizer;
import java.util.StringJoiner;
import java.util.Scanner;
public class J03005 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        buf.nextLine();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(buf.nextLine());
            String firstName = st.nextToken().toUpperCase();

            StringJoiner sj = new StringJoiner(" ", "", ", ");
            sj.setEmptyValue("");
            
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                String w = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                sj.add(w);
            }
            System.out.println(sj + firstName);
        }
    }   
}
