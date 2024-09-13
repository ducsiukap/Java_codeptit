import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class Time {
    private int hour, minute, second;
    private long totalSecond;

    public Time(int hour, int minute, int second) {
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

class TimeComparator implements Comparator<Time> {
    @Override
    public int compare(Time t1, Time t2) { 
        return Long.compare(t1.getTotalSecond(), t2.getTotalSecond()); 
    }
}

public class J05033 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        int n = buf.nextInt();

        Time[] t = new Time[n];
        for (int i = 0; i < n; ++i)
            t[i] = new Time(buf.nextInt(), buf.nextInt(), buf.nextInt());
        buf.close();

        Arrays.sort(t, new TimeComparator());
        for (Time time : t) System.out.println(time.toString());
    }
}
