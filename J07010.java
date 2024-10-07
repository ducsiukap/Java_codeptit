import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;

class SVJ07010 {
    private String id, name, dob, sClass;
    private double gpa;
    private static int tt = 1;

    public SVJ07010(String name, String sClass, String dob, double gpa) {
        this.id = String.format("B20DCCN0%02d", tt);
        ++tt;

        this.name = name;
        this.sClass = sClass;
        this.dob = dob;
        this.gpa = gpa;

        this.fixDOB();
    }

    private void fixDOB() {
        if (dob.charAt(2) != '/') dob = "0" + dob;
        if (dob.charAt(5) != '/') dob = dob.substring(0, 3) + "0" + dob.substring(3);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sClass + " " + dob + " " + String.format("%.2f", gpa);
    }
}

public class J07010 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SV.in"));
            int n = sc.nextInt();
            SVJ07010 sv[] = new SVJ07010[n];
            for (int i = 0; i < n; ++i) {
                sc.nextLine();
                sv[i] = new SVJ07010(sc.nextLine(), 
                sc.nextLine(), sc.nextLine(), sc.nextDouble());
            }

            for (SVJ07010 s : sv) System.out.println(s);
            sc.close();
        } catch (FileNotFoundException e) {}
    }
}
