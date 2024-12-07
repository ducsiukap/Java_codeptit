import java.io.*;
import java.util.*;

class Customer0725 implements Comparable<Customer0725> {

    private String ID, name, gen, dob, add;
    private int d, m, y;
    private static int seqID = 1;

    public Customer0725(String name, String gen, String dob, String add) {
        this.ID = String.format("KH%03d", seqID++);
        this.name = formatedName(name);
        this.gen = gen;
        this.dob = formatedDob(dob);
        this.add = add;
    }

    private String formatedName(String name) {
        String[] N = name.trim().toLowerCase().split("\\s+");
        name = "";
        for (String n : N) {
            name += Character.toUpperCase(n.charAt(0))
                    + n.substring(1) + " ";
        }
        return name;
    }

    private String formatedDob(String dob) {
        String[] Dob = dob.trim().split("/");
        this.d = Integer.parseInt(Dob[0]);
        this.m = Integer.parseInt(Dob[1]);
        this.y = Integer.parseInt(Dob[2]);
        return String.format("%02d/%02d/%d", d, m, y);
    }

    @Override
    public String toString() {
        return String.format("%s %s%s %s %s", ID, name, gen, add, dob);
    }

    @Override
    public int compareTo(Customer0725 o) {
        if (this.y == o.y) {
            if (this.m == o.m) {
                return this.d - o.d;
            } else {
                return this.m - o.m;
            }
        }
        return this.y - o.y;
    }
}

public class J07025 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Customer0725> al = new ArrayList<>();
        while (n-- > 0) {
            al.add(new Customer0725(in.nextLine(),
                    in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(al);
        for (Customer0725 cus : al) {
            System.out.println(cus);
        }
    }
}