import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Customer implements Comparable<Customer> {
    private String id, name, room;
    private Date in, out;
    private int days;
    private static int tt = 1;

    public Customer(String name, String room, Date in, Date out) {
        this.id = String.format("KH%02d", tt);
        ++tt;

        this.name = name;
        this.room = room;
        this.in = in;
        this.out = out;
        this.days = calculateDays();
    }

    private int calculateDays() {
        return (int) ((out.getTime() - in.getTime()) / (24 * 60 * 60 * 1000)) ;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + days;
    }

    @Override
    public int compareTo(Customer other) {
        return other.days - this.days;
    }
}

public class J07046 {
    public static void main(String[] args) throws ParseException {
        try {
            Scanner sc = new Scanner(new File("KHACH.in"));
            int n = sc.nextInt();
            SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
            Customer cus[] = new Customer[n];
            for (int i = 0; i < n; ++i) {
                sc.nextLine();
                String name = sc.nextLine();
                String room = sc.next();
                Date in = d.parse(sc.next());
                Date out = d.parse(sc.next());
                cus[i] = new Customer(name, room, in, out);
            }
            Arrays.sort(cus);
            for (Customer Cus : cus)
                System.out.println(Cus);
            sc.close();
        } catch (FileNotFoundException e) {

        }
    }
}
