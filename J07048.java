import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

class ItemJ07048 implements Comparable<ItemJ07048> {
    private String id, name, bh;
    private int out;

    public ItemJ07048(String id, String name, int out, String bh) {
        this.id = id;
        this.name = name;
        this.out = out;
        this.bh = bh;
    }

    @Override 
    public String toString() {
        return id  + " " + name + " " + out + " " + bh;
    }

    @Override 
    public int compareTo(ItemJ07048 other) {
        if (out == other.out) return id.compareTo(other.id);
        return other.out - out;
    }
}

public class J07048 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SANPHAM.in"));
            int n = sc.nextInt();
            ItemJ07048[] items = new ItemJ07048[n];
            for (int i = 0; i < n; ++i) {
                sc.nextLine();
                items[i] = new ItemJ07048(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.next());
            }
            Arrays.sort(items);
            for (ItemJ07048 item : items)
                System.out.println(item);
            sc.close();
        } catch (FileNotFoundException e) {

        }
    }
}
