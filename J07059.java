import java.util.*;
import java.io.*;

class Exam7059 {
    private int dd, mm, yyyy, time;
    private String id, dateTime, roomID;
    private static int seqID = 1;
    
    public Exam7059(String date, String time, String roomID) {
        this.id = String.format("C%03d", seqID++);
        
        this.dateTime = String.format("%s %s", date, time);
        extractTime(date, time);
        
        this.roomID = roomID;
    }
    
    private void extractTime(String date, String time) {
        String T[] = date.split("/");
        dd = Integer.parseInt(T[0]);
        mm = Integer.parseInt(T[1]);
        yyyy = Integer.parseInt(T[2]);
        
        T = time.split(":");
        this.time = Integer.parseInt(T[0]) * 60 + Integer.parseInt(T[1]);
    }
    
    public int timeCompare(Exam7059 o) { 
        if (time == o.time) 
            return id.compareTo(o.id);
        return time - o.time;
    }
    public int dateCompare(Exam7059 o) {
        if (yyyy == o.yyyy)
            if (mm == o.mm)
                if (dd == o.dd) 
                    return this.timeCompare(o);
                else return dd - o.dd;
            else return mm - o.mm;
        return yyyy - o.yyyy;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", id, dateTime, roomID);
    }
    
    
}
public class J07059 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        ArrayList<Exam7059> al = new ArrayList<>();
        
        while (n --> 0) al.add(new Exam7059(sc.next(), sc.next(), sc.next()));
        al.sort((e1, e2) -> e1.dateCompare(e2));
        
        al.forEach(e->System.out.println(e));
    }
}
