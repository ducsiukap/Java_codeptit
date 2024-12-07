
import java.util.*;
import java.util.stream.Collectors;

class Student0524 {
    private String id, name, sClass, email;

    public Student0524(String id, String name, String sClass, String email) {
        this.id = id;
        this.name = name;
        this.sClass = sClass;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", id, name, sClass, email);
    }

    public String getId() {
        return id;
    }

    public String getsClass() {
        return sClass;
    }
}


public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student0524> students = new ArrayList<>();
        while (n --> 0) students.add(new Student0524(sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Map<String, List<Student0524>> mp = students.stream()
                .filter(e -> { 
                    String field = e.getId().substring(5, 7);
                    return !e.getsClass().startsWith("E") || (!field.equals("CN") && !field.equals("AT"));}
                ).collect(Collectors.groupingBy(e->e.getId().substring(5, 7), 
                        Collectors.toList()));
        
        n = Integer.parseInt(sc.nextLine());
        while (n --> 0) {
            String sClass = sc.nextLine().toUpperCase();
            String ss[], f;
            ss = sClass.split(" ");
            f = "" + ss[0].charAt(0) + ss[1].charAt(0);
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", sClass);
            for (Student0524 s : mp.getOrDefault(f, new ArrayList<>()))
                System.out.println(s);
        }
        
        sc.close();
    }
}