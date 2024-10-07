import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

class ItemJ07050 implements Comparable<ItemJ07050> {
    private String id, name, field;
    private double in, out;
    private static int tt;

    public ItemJ07050(String name, String field, double in, double out) {
        ++tt;
        this.id = String.format("MH%02d", tt);

        this.name = name;
        this.field = field;
        this.in = in;
        this.out = out;
    }

    @Override
    public int compareTo(ItemJ07050 other) {
        double a = other.out - other.in;
        double b = this.out - this.in;
        if (a == b) return 0;
        return (a > b ? 1 : -1);
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + field + String.format(" %.2f", out - in);
    }
}


public class J07050 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MATHANG.in"));
            int n = sc.nextInt();
            ItemJ07050 items[] = new ItemJ07050[n];
            for (int i = 0; i < n; ++i) {
                sc.nextLine();
                items[i] = new ItemJ07050(sc.nextLine(), sc.nextLine(), 
                sc.nextDouble(), sc.nextDouble());
            }

            Arrays.sort(items);
            for (ItemJ07050 item : items)
                System.out.println(item);
            sc.close();
        } catch (FileNotFoundException e) {

        }
    }
}
