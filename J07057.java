import java.io.*;
import java.util.*;

class TS7057 {
    private String id, name, stt;
    private double score;
    
    private static int seqID = 1;

    public TS7057(String name, double score, String dt, int kv) {
        this.id = String.format("TS%02d", seqID++);
        this.name = formatedName(name);
        this.score = score;
        this.score += (dt.equals("Kinh") ? 0 : 1.5);
        this.score += (kv == 1 ? 1.5 : kv == 2 ? 1 : 0);
        this.stt = (this.score >= 20.5 ? "Do" : "Truot");
    }
    
    private String formatedName(String name) {
        String n[] = name.trim().toLowerCase().split("\\s+");
        name = "";
        for (int i = 0; i < n.length; ++i)
            name += Character.toUpperCase(n[i].charAt(0)) + 
                    n[i].substring(1) + " ";
        return name;
    }
    
    public double getScore() { return score; }
    public String getID() { return id; }

    @Override
    public String toString() {
        return String.format("%s %s%.1f %s", id, name, score, stt);
    }
}
public class J07057 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        ArrayList<TS7057> al = new ArrayList<>();
        while (n --> 0) {
            sc.nextLine();
            al.add(new TS7057(sc.nextLine(), Double.parseDouble(sc.nextLine()), 
                                sc.nextLine(), sc.nextInt()));
        }
        
        al.sort((t1, t2) -> {
        if (t1.getScore() == t2.getScore())
            return t1.getID().compareTo(t2.getID());
        return Double.compare(t2.getScore(), t1.getScore());
        });
        
        for (TS7057 t : al) System.out.println(t);
    }
}