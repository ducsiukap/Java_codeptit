import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

class OnlineTime {
    private String name;
    private long totalMinus;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public OnlineTime(String name, String in, String out) {
        this.name = name;
//        Date dateIn = null, dateOut = null;
//        String IN[] = in.split("\\s+"), OUT[] = out.split("\\s+");
//        try {
//        dateIn = sdf.parse(IN[0]);
//        dateOut = sdf.parse(OUT[0]);
//        } catch (ParseException _) {}
//        totalMinus = (dateOut.getTime() - dateIn.getTime()) / (1000 * 60);
//        
//        IN = IN[1].split(":");
//        OUT = OUT[1].split(":");
        try {
        totalMinus = sdf.parse(out).getTime() - sdf.parse(in).getTime();
        totalMinus /= 60000;
        } catch (ParseException _) {}
        
//        totalMinus += (Integer.parseInt(OUT[0]) * 60 + Integer.parseInt(OUT[1]));
//        totalMinus -= (Integer.parseInt(IN[0]) * 60 + Integer.parseInt(IN[1]));
    }
    
    public int compare(OnlineTime o) {
        if (totalMinus == o.totalMinus)
            return name.compareTo(o.name);
        return Long.compare(o.totalMinus, totalMinus);
    }
    
    @Override
    public String toString() {
        return name + " " + totalMinus;  
    }
}

public class J07084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<OnlineTime> al = new ArrayList<>();
        while (n --> 0)
            al.add(new OnlineTime(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        al.sort((t1, t2)->t1.compare(t2));
        al.forEach(t->System.out.println(t));
        sc.close();
    }
}
