import java.io.*;
import java.util.*;

public class J07008 {
    static int x[] = new int[21], n;
    static ArrayList<Integer> al = new ArrayList<>();
    static ArrayList<String> res = new ArrayList<>();
    static String cc;
    static void Try(int i, int last) {
        for (int j = 0; j < 2; ++j) {
            x[i] = j;
            if (j == 1 && last != -1 && al.get(last) > al.get(i))
                continue;
            if (i == n - 1) {
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int k = 0; k <= i; ++k)
                    if (x[k] == 1)
                        tmp.add(al.get(k));
                if (tmp.size() > 1) {
                    tmp.sort((e1, e2) -> (e1 - e2));
                    cc = "";
                    tmp.forEach(e->cc = cc.concat(e + " "));
                    res.add(cc);
                }
            }
            else {
                if (j == 1) Try(i + 1, i);
                else Try(i + 1, last);
            }
            
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for (int i = 0; i < n; ++i) al.add(sc.nextInt());
        Try(0, -1);
        res.sort((e1, e2) -> e1.compareTo(e2));
        res.forEach(e-> System.out.println(e));
        sc.close();
    }
}
