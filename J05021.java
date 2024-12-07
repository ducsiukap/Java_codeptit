
import java.util.*;

class Student0521 {
    private String id, name, sClass, email;

    public Student0521(String id, String name, String sClass, String email) {
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


public class J05021{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student0521> students = new ArrayList<>();
        while (sc.hasNext()) students.add(new Student0521(sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        students.sort((s1, s2) -> { return s1.getId().compareTo(s2.getId());} );
        
        for (Student0521 stu : students) 
            System.out.println(stu);
        
        sc.close();
    }
}

