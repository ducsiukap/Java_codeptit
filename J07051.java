import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Arrays;

class customer implements Comparable<customer> {
    private String id, name, room;
    private int totalCost, serviceFee, roomFee, days;
    private Date in, out;

    static int tt = 1;

    public customer(String name, String room, Date in, Date out, int serviceFee) {
        this.id = String.format("KH%02d", tt);
        ++tt;
        this.name = name; 
        this.fixName();

        this.room = room;
        this.calculateRoomFee();

        this.in = in;
        this.out = out;
        this.calculateDays();

        this.serviceFee = serviceFee;

        this.calculateTotalCost();
    }

    private void fixName() {
        String Name[] = name.trim().toLowerCase().split("\\s+");
        name = "";
        for (int i = 0; i < Name.length; ++i)
            name += Character.toString(Name[i].charAt(0)).toUpperCase() + Name[i].substring(1) + " ";
    }

    private void calculateRoomFee() {
        char floor = room.charAt(0);
        if (floor == '1') roomFee = 25;
        else if (floor == '2') roomFee = 34;
        else if (floor == '3') roomFee = 50;
        else roomFee = 80;
    }

    private void calculateDays() {
        days = (int)((out.getTime() - in.getTime()) / (24 * 60 * 60 * 1000) + 1);
    }

    private void calculateTotalCost() {
        totalCost = days * roomFee + serviceFee;
    }

    @Override
    public String toString() {
        return id + " " + name + room + " " + days + " " + totalCost; 
    }

    @Override
    public int compareTo(customer other) { return other.totalCost - totalCost; }

}

public class J07051 {
    public static void main(String[] args) {
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            int numberOfCostumer = sc.nextInt();
            customer list[] = new customer[numberOfCostumer];
            
            for (int i = 0; i < numberOfCostumer; ++i) {
                sc.nextLine();
                try {
                list[i] = new customer(sc.nextLine(), sc.next(), d.parse(sc.next()), d.parse(sc.next()), sc.nextInt());
                } catch (ParseException e) {}
            }

            Arrays.sort(list);
            for (customer Cus : list)
                System.out.println(Cus);
            sc.close();
        } catch (FileNotFoundException e) {};
    }
}
