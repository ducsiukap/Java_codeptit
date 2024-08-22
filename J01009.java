import java.io.*;

public class J01009 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int n;
        n = Integer.parseInt(buf.readLine());

        long res, tmp;
        res = tmp = 1;
        for (int i = 2; i <= n; ++i){
            tmp *= i;
            res += tmp;
        }
        System.out.println(res);
    }
}


/*
Scanner sc = new Scanner(System.in);
int[] a = new int[size];
for (int i = 0; i < size; ++i)
    a[i] = sc.nextInt();
 */