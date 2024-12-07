import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Course {
    String id, name, tc, day, th;

    public Course(String id, String name, String tc, String day, String th) {
        this.id = id;
        this.name = name;
        this.tc = tc;
        this.day = day;
        this.th = th;
    }

    public String getId() {
        return id;
    }

    public String getTh() {
        return th;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + tc + " " + day + " " + th;
    }
}

public class J07073 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Course> courses = new ArrayList<>();
        while (n --> 0) 
            courses.add(new Course(sc.nextLine(),sc.nextLine(), 
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        List<Course> l = courses.stream().filter(e->!e.getTh().equals("Truc tiep"))
                .collect(Collectors.toList());
        l.sort((e1, e2)->e1.getId().compareTo(e2.getId()));
        l.forEach(e->System.out.println(e));
    }
}
