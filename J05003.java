import java.util.Scanner;

class SinhVienJ05003 {
    private String sID, sName, sDOB, sClass;
    private float gpa;

    public SinhVienJ05003(int sID, String sName, String sClass, String sDOB, float gpa) {
        if (sID < 10) this.sID = "B20DCCN00" + sID;
        else this.sID = "B20DCCN0" + sID;

        this.sName = sName;
        this.sClass = sClass;
        this.sDOB = sDOB;
        this.gpa = gpa;

        fixDOB();
    }

    private void fixDOB() {
        if (sDOB.charAt(2) != '/')
            sDOB = "0" + sDOB;
        if (sDOB.charAt(5) != '/')
            sDOB = sDOB.substring(0, 3) + "0" + sDOB.substring(3);
    }

    @Override
    public String toString() {
        return sID + " " + sName + " " + sClass + " " + sDOB + " " + String.format("%.2f", gpa);
    }
}

public class J05003 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        SinhVienJ05003[] sv = new SinhVienJ05003[n];
        for (int i = 0; i < n; ++i) {
            sc.nextLine();
            sv[i] = new SinhVienJ05003(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        }

        for (int i = 0; i < n; ++i)
            System.out.println(sv[i]);
        sc.close();
    }
}
