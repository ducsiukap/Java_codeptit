import java.io.*;
import java.util.*;

public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> al = (ArrayList<String>) in.readObject();
//        ArrayList<String> al = new ArrayList<>();
//        al.add("Jhsf00dklT12uhf780LPPZH");
//        al.add("AAAAddd0000000000000000001T");
        for (String s : al) {
            String num = "";
            int tong = 0;
            for (int i = 0; i < s.length(); ++i)
                if (Character.isDigit(s.charAt(i))) {
                    num += s.charAt(i);
                    tong += s.charAt(i) - '0';
                }
            for (int i = 0; i < num.length(); ++i) 
                if (num.charAt(i) != '0') {
                    num = num.substring(i);
                    break;
                }
            System.out.println(num + " " + tong);
        }
    }
}
