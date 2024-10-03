import java.util.Scanner;
import java.util.Arrays;
class SinhVienJ05005 implements Comparable<SinhVienJ05005> {
    private String sID, sName, sDOB, sClass;
    private float gpa;

    public SinhVienJ05005(int sID, String sName, String sClass, String sDOB, float gpa) {
        if (sID < 10) this.sID = "B20DCCN00" + sID;
        else this.sID = "B20DCCN0" + sID;

        this.sName = sName;
        this.sClass = sClass;
        this.sDOB = sDOB;
        this.gpa = gpa;

        fixName();
        fixDOB();
    }

    private void fixName() {
        String[] name = sName.trim().split("\\s+");
        sName = "";
        for (int i = 0; i < name.length; ++i) {
            sName += name[i].substring(0, 1).toUpperCase() + name[i].substring(1).toLowerCase();
            sName += " ";
        }
    }
    private void fixDOB() {
        if (sDOB.charAt(2) != '/')
            sDOB = "0" + sDOB;
        if (sDOB.charAt(5) != '/')
            sDOB = sDOB.substring(0, 3) + "0" + sDOB.substring(3);
    }

    @Override
    public String toString() {
        return sID + " " + sName + sClass + " " + sDOB + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(SinhVienJ05005 other) {
        if (this.gpa == other.gpa) 
            return other.sID.compareTo(this.sID);
        return (this.gpa < other.gpa ? 1 : -1);
    }
}

public class J05005 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        SinhVienJ05005[] sv = new SinhVienJ05005[n];
        for (int i = 0; i < n; ++i) {
            sc.nextLine();
            sv[i] = new SinhVienJ05005(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        }

        Arrays.sort(sv);
        for (int i = 0; i < n; ++i)
            System.out.println(sv[i]);
        sc.close();
    }
}

