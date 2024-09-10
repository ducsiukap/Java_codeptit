/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class J03010 {
    static Map<String, Integer> mp = new HashMap<>();

    static String getEmail(String name) {
        StringTokenizer st = new StringTokenizer(name);
        String email = "";

        while (true) {
            String word = st.nextToken();
            if (st.hasMoreTokens()) {
                email = email + Character.toLowerCase(word.charAt(0));
            } else {
                email = word.toLowerCase() + email;
                Integer f = mp.getOrDefault(email, 1);
                mp.put(email, f + 1);
                if (f > 1)
                    email = email + f.toString();
                break;
            }
        }
        return email;
    }

    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int t = buf.nextInt();
        buf.nextLine();

        while (t-- > 0) {
            String name = buf.nextLine();
            System.out.println(getEmail(name) + "@ptit.edu.vn");
        }
        buf.close();
    }
}