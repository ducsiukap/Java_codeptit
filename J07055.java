import java.io.*;
import java.util.*;

class SV7055 {
    private String ID, name, type;
    private double avg;
    private static int seqID = 1;
    public SV7055(String name, float s1, float s2, float s3) {
        this.ID = String.format("SV%02d", seqID++);
        this.name = formatedName(name);
        this.avg =  (s1*0.25 + s2*0.35 + s3*0.4);
        this.type = (avg >= 8) ? "GIOI" : 
                avg >= 6.5 ? "KHA" : 
                avg >= 5 ? "TRUNG BINH" : "KEM";
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
        return String.format("%s %s%.2f %s", ID, name, avg, type);
    }
}


public class J07055 {
    static int rank;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        ArrayList<SV7055> al = new ArrayList<>();
        while (n --> 0) {
            sc.nextLine();
            al.add(new SV7055(sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }
        
        al.sort((s1, s2) -> Double.compare(s2.getAvg(), s1.getAvg()));
        for (SV7055 s : al) 
            System.out.println(s);
    }
}
