import java.util.Scanner;

public class HINHCHUNHAT {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);

        int a, b;
        a = buf.nextInt();
        b = buf.nextInt();
        if (a <= 0 || b <= 0)
            System.out.println(0);
        else
            System.out.println((2 * (a + b)) + " " + (a * b));
    }
}