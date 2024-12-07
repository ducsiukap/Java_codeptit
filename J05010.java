
import java.util.*;

class Item0510 {
    private static int sID = 1;
    private int id;
    private String name, group;
    private double in, out, profit;

    public Item0510(String name, String group, double in, double out) {
        this.id = sID++;

        this.name = name;
        this.group = group;
        this.in = in;
        this.out = out;

        profit = out - in;
    }

    public double getProfit() { return profit; }
    public static Comparator<Item0510> sortByProfit() {
        return Comparator.comparingDouble(Item0510::getProfit).reversed();
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.2f", id, name, group, profit);
    }
}

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Item0510> items = new ArrayList<>();

        for (int i = 0; i < n; ++i)
            items.add(new Item0510(sc.nextLine(), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));

        items.sort(Item0510.sortByProfit());

        for (Item0510 item : items) System.out.println(item);

        sc.close();
    }
}
