
import java.util.*;

class Student0520 {
    private String id, name, sClass, email;

    public Student0520(String id, String name, String sClass, String email) {
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


public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student0520> students = new ArrayList<>();
        while (n --> 0) students.add(new Student0520(sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        students.sort((s1, s2) -> {
            if (s1.getsClass().equals(s2.getsClass())) return s1.getId().compareTo(s2.getId());
            return s1.getsClass().compareTo(s2.getsClass());
        });
        
        for (Student0520 stu : students) 
            System.out.println(stu);
        
        sc.close();
    }
}

