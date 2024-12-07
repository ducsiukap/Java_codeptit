import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class SV7054 implements Comparable<SV7054> {
    private String ID, name;
    private double avg;
    private static int seqID = 1;
    public SV7054(String name, float s1, float s2, float s3) {
        this.ID = String.format("SV%02d", seqID++);
        this.name = formatedName(name);
        this.avg =  (s1*3 + s2*3 + s3*2) / 8;
    }
    
    private String formatedName(String name) {
        String n[] = name.trim().toLowerCase().split("\\s+");
        name = "";
        for (int i = 0; i < n.length; ++i)
            name += Character.toUpperCase(n[i].charAt(0)) + n[i].substring(1)+ " ";
        return name;
    }

    public double getAvg() { return avg; }

    @Override
    public String toString() {
        return String.format("%s %s", ID, name);
    }

    @Override
    public int compareTo(SV7054 o) { return this.name.compareTo(o.name); }
}


public class J07054 {
    static int rank;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        ArrayList<SV7054> al = new ArrayList<>();
        while (n --> 0) {
            sc.nextLine();
            al.add(new SV7054(sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }
        
        TreeMap<Double, TreeSet<SV7054>> mp = new TreeMap<>();
        al.forEach(e->{
            TreeSet<SV7054> st = new TreeSet<>();
            if (mp.get(e.getAvg()) != null)
                st = mp.get(e.getAvg());
            st.add(e);
            mp.put(e.getAvg(), st);
        });
        
        Map<Double, TreeSet<SV7054>> mp2 = mp.descendingMap();
        rank = 1;
        mp2.forEach((k, v) -> {
            for (SV7054 s : v)
                System.out.printf("%s%.2f %d\n", s, k, rank);
            rank += v.size();
        });
    }
}
