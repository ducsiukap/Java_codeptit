import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class IntSet {
    private Set<Integer> set;

    public IntSet(int[] a) {
        set = new TreeSet<>();
        for (int i : a)
            set.add(i);
    }

    private IntSet(Set<Integer> set) { this.set = set; }

    public IntSet union(IntSet other) {
        Set<Integer> x = new TreeSet<>(this.set);
        x.addAll(other.set);
        return new IntSet(x);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i : set) 
            sb.append(i).append(" ");
        return sb.toString();
    }
}

public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
        sc.close();
    }
}
