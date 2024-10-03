import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] mark = new int[1001];
        while (sc.hasNext())  ++mark[sc.nextInt()];

        for (int i = 0; i <= 1000; ++i) 
            if (mark[i] != 0) System.out.println(i + " " + mark[i]);
        sc.close();
    }
}
