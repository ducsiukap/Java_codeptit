
import java.util.*;
import java.util.stream.Collectors;

class Student0522 {
    private String id, name, sClass, email;

    public Student0522(String id, String name, String sClass, String email) {
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


public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student0522> students = new ArrayList<>();
        while (n --> 0) students.add(new Student0522(sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Map<String, List<Student0522>> mp = students.stream()
                .collect(Collectors.groupingBy(Student0522::getsClass, Collectors.toList()));
        
        n = Integer.parseInt(sc.nextLine());
        while (n --> 0) {
            String sClass = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", sClass);
            for (Student0522 s : mp.getOrDefault(sClass, new ArrayList<Student0522>()))
                System.out.println(s);
        }
        
        sc.close();
    }
}
