
import java.util.*;

class EmployeeJ0507 implements Comparable<EmployeeJ0507>{
    private String id, name, gen, dob, add, mst, signedDate;
    private static int sID = 1;
    private int D[];

    public EmployeeJ0507(String name, String gen, String dob, String add, String mst, String signedDate) {
        this.id = String.format("%05d", sID++);
        this.name = name;
        this.gen = gen;
        this.dob = dob;
        this.add = add;
        this.mst = mst;
        this.signedDate = signedDate;

        D = new int[3];
        String tmp[] = dob.split("/");
        for (int i = 0; i < 3; i++)
            D[i] = Integer.parseInt(tmp[i]);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", id, name, gen, dob, add, mst, signedDate);
    }

    @Override
    public int compareTo(EmployeeJ0507 o) {
        if (D[2] == o.D[2]) {
            if (D[1] == o.D[1]) {
                if (D[0] == o.D[0]) return id.compareTo(o.id);
                else return Integer.compare(D[0], o.D[0]);
            }
            else return Integer.compare(D[1], o.D[1]);
        }
        return Integer.compare(D[2], o.D[2]);
    }

}

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        EmployeeJ0507[] employees = new EmployeeJ0507[n];
        for (int i = 0; i < n; i++) {
            employees[i] = new EmployeeJ0507(sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }

        Arrays.sort(employees);
        for (EmployeeJ0507 Emp : employees) System.out.println(Emp);
        sc.close();
    }
}
