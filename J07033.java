import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class sucVat implements Comparable<sucVat>{
    private String id, name, class_, email;

    public sucVat(String id, String name, String class_, String email) {
        this.id = id;
        this.name = name;
        formatName();
        this.class_ = class_;
        this.email = email;
    }

    private void formatName() {
        StringBuilder sb = new StringBuilder();
        String[] NAME = name.trim().split("\\s+");
        for (int i = 0; i < NAME.length; ++i) {
            sb.append(Character.toUpperCase(NAME[i].charAt(0)));
            sb.append(NAME[i].substring(1).toLowerCase());
            sb.append(' ');
        }
        name = sb.toString();
    }
    
    @Override
    public String toString() {
        return (id + " " + name + class_ + " " + email);
    }

    public int compareTo(sucVat other) { return id.compareTo(other.id); }
}

public class J07033 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner buf = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(buf.nextLine());
        sucVat[] sv = new sucVat[n];

        for (int i = 0; i < n; ++i) {
            String id, name, class_, email;
            id = buf.nextLine();
            name = buf.nextLine();
            class_ = buf.nextLine();
            email = buf.nextLine();
            sv[i] = new sucVat(id, name, class_, email);
        }

        Arrays.sort(sv);
        for (sucVat s : sv)
            System.out.println(s.toString());

        buf.close();
    }
}
