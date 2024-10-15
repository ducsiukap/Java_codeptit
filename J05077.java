import java.util.Scanner;
import java.util.HashMap;
class StaffJ05077 {
    private String id, name;
    private int spd, days;
    private long salary;

    public StaffJ05077(String id, String name, int spd, int days) {
        this.id = id;
        this.name = name;
        this.spd = spd; // salary per day
        this.days = days;
    }

    public void calculateSalary(int factor) {
        salary = 1000L * spd * days * factor;
    }

    public long getSalary() {
        return salary;
    }

    public String getLab() { return id.substring(id.length() - 2); }

    public int hash() {
        int idx = id.charAt(0) - 'A';
        idx *= 4;
        int year = Integer.parseInt(id.substring(1, 3));
        idx += year <= 3 ? 0 : year <= 8 ? 1 : year <= 15 ? 2 : 3;
        return idx;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}


public class J05077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] factor = {10, 12, 14, 20, 10, 11, 13, 16, 9, 10, 12, 14, 8, 9, 11, 13};

        HashMap<String, String> labs = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String lab = sc.nextLine();
            labs.put(lab.substring(0, 2), lab.substring(3));
        }

        n = Integer.parseInt(sc.nextLine());
        StaffJ05077[] staffs = new StaffJ05077[n];
        for (int i = 0; i < n; i++)
            staffs[i] = new StaffJ05077(sc.nextLine(), sc.nextLine(),
                    Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        for (int i = 0; i < n; i++) {
            staffs[i].calculateSalary(factor[staffs[i].hash()]);
        }

        for (StaffJ05077 staff : staffs) {
            System.out.print(staff + " ");
            System.out.print(labs.get(staff.getLab()) + " ");
            System.out.println(staff.getSalary());
        }
    }
}
