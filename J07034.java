import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

class subjectJ07034 implements Comparable<subjectJ07034> {
    private String id, name;
    private int TC;

    public subjectJ07034(String id, String name, int TC) {
        this.id = id;
        this.name = name;
        this.TC = TC;
    }

    @Override
    public int compareTo(subjectJ07034 other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + TC;
    }
}

public class J07034 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = sc.nextInt();
            subjectJ07034 mh[] = new subjectJ07034[n];
            for (int i = 0; i < n; ++i) {
                sc.nextLine();
                mh[i] = new subjectJ07034(sc.nextLine(), sc.nextLine(), sc.nextInt());
            }
            Arrays.sort(mh);
            for (subjectJ07034 m : mh) 
                System.out.println(m);
            sc.close();
        } catch (FileNotFoundException e) {}
    }
}
