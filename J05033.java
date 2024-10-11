import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class TimeJ05033 {
    private int hour, minute, second;
    private long totalSecond;

    public TimeJ05033(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        calculateTotalSecond();
    }

    private void calculateTotalSecond() { totalSecond = hour * 3600 + minute * 60 + second; }

    public long getTotalSecond() { return totalSecond; }
    @Override
    public String toString() { return (hour + " " + minute + " " + second); }
}

class TimeJ05033Comparator implements Comparator<TimeJ05033> {
    @Override
    public int compare(TimeJ05033 t1, TimeJ05033 t2) {
        return Long.compare(t1.getTotalSecond(), t2.getTotalSecond()); 
    }
}

public class J05033 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int n = buf.nextInt();

        TimeJ05033[] t = new TimeJ05033[n];
        for (int i = 0; i < n; ++i)
            t[i] = new TimeJ05033(buf.nextInt(), buf.nextInt(), buf.nextInt());
        buf.close();

        Arrays.sort(t, new TimeJ05033Comparator());
        for (TimeJ05033 time : t) System.out.println(time.toString());
    }
}
