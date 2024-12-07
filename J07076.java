import java.io.*;
import java.util.*;

public class J07076 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt(),
                m = sc.nextInt(),
                idx = sc.nextInt() - 1;
            
            ArrayList<ArrayList<Integer>> al = new ArrayList<>();
            for (int i = 0; i < m; ++i) al.add(new ArrayList<>());
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    al.get(j).add(sc.nextInt());
            ArrayList<Integer> a = al.get(idx);
            a.sort((e1, e2)->e1-e2);
            al.add(idx, a);
            al.remove(idx+1);
            
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j)
                    System.out.print(al.get(j).get(i) + " ");
                System.out.println("");
            }
        }
        sc.close();
    }
}
