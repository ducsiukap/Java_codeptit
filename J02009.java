import java.util.Scanner;
import java.util.Arrays;

class checkin implements Comparable<checkin> {
    private int st, en;
    checkin(int st, int en) {
        this.st = st;
        this.en = en;
    }

    public int getST() {
        return st;
    }

    public int getEN() {
        return en;
    }



    @Override
    public int compareTo(checkin other) {
        if (st == other.st)
            return en - other.en;
        return st - other.st;
    }
}

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkin[] a = new checkin[n];
        for (int i = 0; i < n; ++i) {
            a[i] = new checkin(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(a);
        int end = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i].getST() > end)
                end = a[i].getST();
            end += a[i].getEN();
        }
        System.out.println(end);
        sc.close();
    }
}
