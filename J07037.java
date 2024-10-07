import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

class DN implements Comparable<DN> {
    private String id, name;
    private int max;

    public DN(String id, String name, int max) {
        this.id = id;
        this.name = name;
        this.max = max;
    }

    @Override
    public int compareTo(DN other) {
        return this.id.compareTo(other.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + max;
    }
}

public class J07037 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DN.in"));
            int n = sc.nextInt();
            DN dn[] = new DN[n];
            for (int i = 0; i < n; ++i) {
                sc.nextLine();
                dn[i] = new DN(sc.nextLine(), sc.nextLine(), sc.nextInt());
            }

            Arrays.sort(dn);
            
            for (DN x : dn) System.out.println(x);
            sc.close();
        } catch (FileNotFoundException e) {

        }
    }
}
