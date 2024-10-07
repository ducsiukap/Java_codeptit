import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class PairJ01017<T1, T2> {
    private T1 a;
    private T2 b;
    public PairJ01017(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }
    private boolean checkPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); ++i)
            if (n % i == 0) return false;
        return true;
    }
    public boolean isPrime() {
        return (checkPrime((Integer)a) && checkPrime((Integer)b));
    }

    @Override
    public String toString() {
        return a + " " + b;
    }
}

public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                PairJ01017<Integer, Integer> p = new PairJ01017<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
        sc.close();
    }
}
