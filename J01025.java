import java.util.Scanner;
import java.util.StringTokenizer;
public class J01025 {
    public static void main(String[] args){
        Scanner buf = new Scanner(System.in);

        int[][] a = new int[2][4];
        for (int i = 0; i < 2; ++i)
            for (int j = 0; j < 4; ++j)
                a[i][j] = buf.nextInt();

        int x = (Math.max(a[0][2], a[1][2]) - Math.min(a[0][0], a[1][0]));
        int y = (Math.max(a[0][3], a[1][3]) - Math.min(a[0][1], a[1][1]));

        int e = Math.max(x, y);
        System.out.println(e * e);
    }
}

