import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

//class Subject7075 {
//    private String subName;
//    private int subLength;
//    
//    public Subject7075(String sName, int sLen) {
//        this.subName = sName;
//        this.subLength = sLen;
//    }
//
//    public String getName() { return subName; }
//}

class HP implements Comparable<HP> {
    private static int seqID = 1;
    private String ID, subID, teacher, room;
    private int day, kip;

    public HP(String subID, int day, int kip, String teacher, String room) {
        this.ID = String.format("HP%03d", seqID++);
        this.subID = subID;
        this.teacher = teacher;
        this.room = room;
        this.day = day;
        this.kip = kip;
    }
    public String getSubID() { return subID; }
    public String getTeacher() { return teacher; }
    public String getInfor(String subName) {
        return String.format("%s %s %d %d %s", ID, subName, day, kip, room);
    }

    @Override
    public int compareTo(HP o) {
        if (day == o.day) 
            if (kip == o.kip) 
                return teacher.compareTo(o.teacher);
            else return kip - o.kip;
        return day - o.day;
    }
    
    
}

public class J07075 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        Map<String, String> subject = new HashMap<>(); 
        for (int i = 0; i < n; ++i) {
            subject.put(sc.nextLine(), sc.nextLine());
            sc.nextLine();
        }
        
        // System.out.println(subject);
        sc = new Scanner(new File("LICHGD.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<HP> courses = new ArrayList<>();
        while (n --> 0) 
            courses.add(new HP(sc.nextLine(), Integer.parseInt(sc.nextLine()), 
            Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        
        String teacher = sc.nextLine();
        List<HP> l = courses.stream()
                .filter(e->e.getTeacher().equals(teacher))
                .collect(Collectors.toList());
        
        Collections.sort(l);
        
        System.out.println("LICH GIANG DAY GIANG VIEN " + teacher + ":");
        for (HP course : l)
            System.out.println(course.getInfor(
                    subject.get(course.getSubID())));
    }
}