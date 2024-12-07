import java.io.*;
import java.util.*;

class Bill0756 {
    private long inRange, outRange, VAT, totalCost;
    private static int seqID = 1;
    private String id, name, type;

    public Bill0756(String name, String type, int stNum, int enNum) {
        id = String.format("KH%02d", seqID++);
        this.name = stdName(name);
        this.type = type;
        
        int totalUsed = (enNum - stNum);
        int range = (type.charAt(0) == 'A') ? 100 : type.charAt(0) == 'B' ? 500 : 200; 
        inRange = Math.min(range, totalUsed) * 450;
        outRange = Math.max(0, totalUsed - range) * 1000;
        VAT = outRange * 5 / 100;
        totalCost = inRange + outRange + VAT;
    }
    
    public long getTotalCost() { return totalCost; }
    
    private String stdName(String name) {
        String n[] = name.trim().toLowerCase().split("\\s+");
        name = "";
        for (int i = 0; i < n.length; ++i)
            name += Character.toUpperCase(n[i].charAt(0)) + 
                    n[i].substring(1) + " ";
        return name;
    }
    @Override
    public String toString() {
        return id + " " + name + inRange + " " + outRange + " " + VAT + " " + totalCost;
    }
}
public class J07056 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList<Bill0756> al = new ArrayList<>();
        while (n --> 0) {
            sc.nextLine();
            al.add(new Bill0756(sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
        }
        
        al.sort((e1, e2) -> Long.compare(e2.getTotalCost(), e1.getTotalCost()));
        al.forEach(e->System.out.println(e));
    }
}
