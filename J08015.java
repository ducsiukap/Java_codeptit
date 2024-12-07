import java.io.*;
import java.util.*;

public class J08015 {
    static long ans;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {          
            Map<Long, Long> mp = new HashMap<>();  
            long n = sc.nextLong(), k = sc.nextLong();
            for (int i = 0; i < n; ++i) {
                long x = sc.nextLong();
                mp.put(x, mp.getOrDefault(x, 0l) + 1);
            }
            ans = 0;
            if ((k&1) == 0 && mp.get(k>>1) != null) {
                ans = (n*(n-1))>>1; 
                mp.remove(k>>1);
            }
            mp.forEach((x, v)->{
                if (mp.get(k - x) != null) {
                    ans += v * mp.get(k - x);
                    mp.replace(k - x, 0l);
                }
            });
            System.out.println(ans);
        }
        
        sc.close();
    }
}