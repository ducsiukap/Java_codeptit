
import java.util.*;

class EmployeeJ0506 {
    private String id, name, gen, dob, add, mst, signedDate;
    private static int sID = 1;

    public EmployeeJ0506(String name, String gen, String dob, String add, String mst, String signedDate) {
        this.id = String.format("%05d", sID++);
        this.name = name;
        this.gen = gen;
        this.dob = dob;
        this.add = add;
        this.mst = mst;
        this.signedDate = signedDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", id, name, gen, dob, add, mst, signedDate);
    }
}

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        EmployeeJ0506[] employees = new EmployeeJ0506[n];
        for (int i = 0; i < n; i++) {
            employees[i] = new EmployeeJ0506(sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }

        for (EmployeeJ0506 Emp : employees) System.out.println(Emp);
        sc.close();
    }
}
