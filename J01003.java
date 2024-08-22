import java.io.*;
import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) throws IOException
    {
//        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//
//        float a, b;
//        a = Float.parseFloat(buf.readLine());
//        b = Float.parseFloat(buf.readLine());

        Scanner buf = new Scanner(System.in);
        float a, b;

        a = buf.nextFloat();
        b = buf.nextFloat();

        if (a == 0)
            System.out.println((b == 0 ? "VSN" : "VN"));
        else
            System.out.printf("%.2f\n", -b / a);
    }
}
