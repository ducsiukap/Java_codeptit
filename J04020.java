import java.util.Scanner;

class Pair<E, F> {
    private E a;
    private F b;

    Pair(E a, F b) {
        this.a = a;
        this.b = b;
    }

    public boolean isPrime() { return checkPrime((Integer) a) && checkPrime((Integer) b); }

    private boolean checkPrime(int n) {
        if (((n & 1) == 0) && (n != 2)) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
            if (n % i == 0)
                return false;
        return true;
    }

    @Override
    public String toString() { return (a + " " + b); }

}

public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check)
                System.out.println(-1);
        }
        sc.close();
    }
}