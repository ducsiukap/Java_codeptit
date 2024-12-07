import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class J08012 {
    public static void main(String[] args) throws IOException {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (--n > 0) {
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(sc.nextInt());
            tmp.add(sc.nextInt());
            al.add(tmp);
        }
        int i = al.get(0).get(0);
        int j = al.get(0).get(1);
        if (al.stream().filter(e->e.contains(i))
                .collect(Collectors.toList()).size() == al.size())
            System.out.println("Yes");
        else if (al.stream().filter(e->e.contains(j))
                .collect(Collectors.toList()).size() == al.size())
            System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}
