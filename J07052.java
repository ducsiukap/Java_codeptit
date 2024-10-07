import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

class StudentJ07052 implements Comparable<StudentJ07052> {
    private String id, name;
    private double s1, s2, s3, total, bonus;

    public StudentJ07052(String id, String name, double s1, double s2, double s3) {
        this.id = id;
        bonus = (id.charAt(2) == '1' ? 0.5 : (id.charAt(2) == '2' ? 1 : 2.5));
        this.name = name;
        fixName();
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        total = 2 * this.s1 + this.s2 + this.s3 + bonus;
    }

    private void fixName() {
        String[] Name = name.trim().split("\\s+");
        name = "";
        for (int i = 0; i < Name.length; ++i)
            name += Name[i].substring(0, 1).toUpperCase() +
                    Name[i].substring(1).toLowerCase() + " ";
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        boolean ok1 = false, ok2 = false;
        if ((int) bonus == bonus)
            ok1 = true;
        if ((int) total == total)
            ok2 = true;
        return id + " " + name +
        String.format(ok1 ? "%.0f" : "%.1f", bonus) + " " +
        String.format(ok2 ? "%.0f" : "%.1f", total);
    }

    @Override
    public int compareTo(StudentJ07052 other) {
        if (total == other.total)
            return id.compareTo(other.id);
        return (other.total > total ? 1 : -1);
    }
}

public class J07052 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = sc.nextInt();
            StudentJ07052[] Students = new StudentJ07052[n];
            for (int i = 0; i < n; ++i) {
                sc.nextLine();
                Students[i] = new StudentJ07052(sc.nextLine(), sc.nextLine(),
                        sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }
            Arrays.sort(Students);
            int k = sc.nextInt();
            double trung = Students[k - 1].getTotal();
            System.out.printf("%.1f\n", trung);
            for (StudentJ07052 student : Students) {
                System.out.print(student + " ");
                System.out.println((student.getTotal() >= trung) ? "TRUNG TUYEN" : "TRUOT");
            }
            sc.close();
        } catch (FileNotFoundException e) {

        }
    }
}