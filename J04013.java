import java.util.Scanner;
public class J04013 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        String id = buf.nextLine();
        String name = buf.nextLine();

        float bonus = id.charAt(2) == '3' ? 2.5f : (id.charAt(2) == '2' ? 1 : 0.5f);
        float sub1 = buf.nextFloat();
        float sub2 = buf.nextFloat();
        float sub3 = buf.nextFloat();
        float totalScore = sub1 * 2 + sub2 + sub3;

        String status = totalScore + bonus >= 24 ? "TRUNG TUYEN" : "TRUOT";

        System.out.print(id + " " + name + " ");
        if ((int) bonus == bonus)
            System.out.print((int)bonus + " ");
        else System.out.print(bonus + " ");

        if ((int) totalScore == totalScore)
            System.out.print((int)totalScore + " ");
        else System.out.print(totalScore + " ");
        
        System.out.println(status);
        buf.close();
    }
}
