
import java.util.*;

class TimeUsed0511 {
    private String id, name, in, out;
    private int totalMinus, h, m;

    public TimeUsed0511(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.in = in;
        this.out = out;

        String [] OUT = out.split(":");
        String [] IN = in.split(":");

        totalMinus = (Integer.parseInt(OUT[0]) - Integer.parseInt(IN[0])) * 60 +
                      Integer.parseInt(OUT[1]) - Integer.parseInt(IN[1]);

        h = totalMinus / 60;
        m = totalMinus % 60;
    }

    public int getTotalMinus() { return totalMinus; }

    public static Comparator<TimeUsed0511> cmp() {
        return Comparator.comparingInt(TimeUsed0511::getTotalMinus).reversed();
    }

    @Override
    public String toString() { return String.format("%s %s %d gio %d phut", id, name, h, m); }
}

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<TimeUsed0511> times = new ArrayList<>();
        while (n-- > 0)
            times.add(new TimeUsed0511(sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine()));

        times.sort(TimeUsed0511.cmp());
        for (TimeUsed0511 t : times) System.out.println(t);
        sc.close();
    }
}
