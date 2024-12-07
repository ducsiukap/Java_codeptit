
import java.util.*;
import java.util.stream.Collectors;

class Student0523 {
    private String id, name, sClass, email;

    public Student0523(String id, String name, String sClass, String email) {
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


public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student0523> students = new ArrayList<>();
        while (n --> 0) students.add(new Student0523(sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Map<String, List<Student0523>> mp = students.stream()
                .collect(Collectors.groupingBy(e->String.format("20%s", e.getsClass().substring(1, 3)),
                        Collectors.toList()));
        
        n = Integer.parseInt(sc.nextLine());
        while (n --> 0) {
            String sClass = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", sClass);
            for (Student0523 s : mp.getOrDefault(sClass, new ArrayList<Student0523>()))
                System.out.println(s);
        }
        
        sc.close();
    }
}
