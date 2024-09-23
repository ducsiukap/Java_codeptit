import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

class subjectJ07058 implements Comparable<subjectJ07058> {
    private String id, name, examFormat;

    subjectJ07058(String id, String name, String ex) {
        this.id = id;
        this.name = name;
        this.examFormat = ex;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + examFormat;
    }

    @Override
    public int compareTo(subjectJ07058 other) {
        return id.compareTo(other.id);
    }
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        subjectJ07058[] sub = new subjectJ07058[n];
        for (int i = 0; i < n; ++i)
            sub[i] = new subjectJ07058(sc.nextLine(), sc.nextLine(), sc.nextLine());

        Arrays.sort(sub);
        for (subjectJ07058 s : sub) 
            System.out.println(s);
        sc.close();
    }
}
