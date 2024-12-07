
import java.util.*;

class StudentJ0509 {
    private static int sID = 1;
    private static double bestScore = 0;
    private int ID;
    private String name, dob;
    private double A, B, C, totalScore;

    public StudentJ0509(String name, String dob, double A, double B, double C) {
        this.ID = sID++;
        this.name = name;
        this.dob = dob;
        this.A = A;
        this.B = B;
        this.C = C;

        totalScore = A + B + C;
        bestScore = Math.max(totalScore, bestScore);
    }

    public boolean isThuKhoa() { return totalScore == bestScore; }

    @Override
    public String toString() {
        return String.format("%d %s %s %.1f", ID, name, dob, totalScore);
    }
}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        StudentJ0509[] students = new StudentJ0509[n];
        for (int i = 0; i < n; i++)
            students[i] = new StudentJ0509(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        for (StudentJ0509 student : students)
            if (student.isThuKhoa()) System.out.println(student);
        sc.close();
    }
}
