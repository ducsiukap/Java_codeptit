import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class LoaiPhong implements Comparable<LoaiPhong> {
    private String info, name;

    public LoaiPhong(String in) {
        info = in;
        name = info.split("[ ]+")[1];
    }

    @Override
    public int compareTo(LoaiPhong other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() { return info; }
}


public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
        in.close();
    }
}
