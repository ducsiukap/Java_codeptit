import java.util.Scanner;

class StudentJ04006 {
    private String sID, sName, sClass, sDoB;
    private float sGPA;

    public StudentJ04006() {
        this.sID = "B20DCCN001";
        this.sName = this.sClass = this.sDoB;
        this.sGPA = 0;
    }

    public void standardizeDOB() {
        StringBuilder sb = new StringBuilder(this.sDoB);
        if (sb.charAt(2) != '/')
            sb.insert(0, '0');
        if (sb.charAt(5) != '/')
            sb.insert(3, '0');
        this.sDoB = sb.toString();
    }

    @Override
    public String toString() {
        standardizeDOB();
        return (this.sID + " " + this.sName + " " +
        this.sClass + " " + this.sDoB + " ");
    }

    public void setName(String name) { this.sName = name; }
    public void setDoB(String dob) { this.sDoB = dob; }
    public void setClass(String Class) { this.sClass = Class; }
    public void setGPA(float gpa) { this.sGPA = gpa; }
    
    public float getGPA() { return this.sGPA; }
}

public class J04006 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        StudentJ04006 a = new StudentJ04006();
        a.setName(buf.nextLine());
        a.setClass(buf.nextLine());
        a.setDoB(buf.nextLine());
        a.setGPA(buf.nextFloat());

        System.out.print(a.toString());
        System.out.printf("%.2f\n", a.getGPA());
        buf.close();
    }
}
