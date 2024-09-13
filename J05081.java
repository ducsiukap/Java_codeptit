import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class Item {
    private int id;
    private String name, unit, sID;
    private long sellPrice, importPrice, profit;

    public Item(int id, String name, String unit, long importPrice, long sellPrice) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;

        this.profit = sellPrice - importPrice;
        sID = "MH0" + ((this.id < 10) ? ("0" + this.id) : this.id);
    }

    public long getProfit() { return profit; }
    public int getID() { return this.id; }

    @Override
    public String toString() { return (sID + " " + name + " " + unit + " " + 
    importPrice + " " + sellPrice + " " + profit); }
}

class profitComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) { 
        long aProfit, bProfit;
        aProfit = a.getProfit();
        bProfit = b.getProfit();

        if (aProfit == bProfit) {return (a.getID() - b.getID());}
        return Long.compare(bProfit, aProfit);
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int n = buf.nextInt();

        Item[] items = new Item[n];
        for (int i = 0; i < n; ++i) {
            buf.nextLine();
            items[i] = new Item(i + 1, buf.nextLine(), 
            buf.nextLine(), buf.nextLong(), buf.nextLong());
        }

        Arrays.sort(items, new profitComparator());
        for (Item item : items) 
            System.out.println(item.toString());

        buf.close();
    }
}
