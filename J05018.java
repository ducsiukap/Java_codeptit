
import java.util.*;

class Student0518 implements Comparable<Student0518> {
    private String name, stt, id;
    private double avg;
    private static int sID = 1;

    public Student0518(String name, String s) {
        id = String.format("HS%02d", sID++);
        this.name = name;

        String[] score = s.split("\\s+");
        avg = (Double.parseDouble(score[0]) + Double.parseDouble(score[1])) * 2;
        for (int i = 2; i < 10; ++i) avg += Double.parseDouble(score[i]);
        avg /= 12;
        avg = Math.round(avg * 10) / 10.0;

        stt = avg >= 9 ? "XUAT SAC" :
                avg >= 8 ? "GIOI" :
                        avg >= 7 ? "KHA" :
                                avg >= 5 ? "TB" : "YEU";
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", id, name, avg, stt);
    }

    @Override
    public int compareTo(Student0518 o) {
        if (avg == o.avg) return id.compareTo(o.id);
        return Double.compare(o.avg, avg);
    }
}

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student0518> students = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0)
            students.add(new Student0518(sc.nextLine(), sc.nextLine()));

        students.sort(Student0518::compareTo);
        for (Student0518 student : students) System.out.println(student);

        sc.close();
    }
}