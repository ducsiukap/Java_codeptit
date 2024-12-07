import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Name{
    private String fName, lName, hehe;

    public Name(String name) {
        String w[] = name.split("\\s+");
        lName = w[w.length - 1];
        fName = "";
        hehe = "";
        for (int i = 0; i < w.length - 1; ++i) {
            fName += w[i] + " ";
            hehe += w[i].charAt(0);
        }
        hehe += lName.charAt(0);
    }
    
    public boolean matchName(String bief) {
        int len = (bief.length() + 1) / 2;
        if (len != hehe.length())
            return false;
        for (int i = 0; i < len; ++i) {
            char c = bief.charAt(i<<1);
            if (c != '*' && c != hehe.charAt(i))
                return false;
        }
        return true;
    }
    
    public int nameCompare(Name o) {
        if (lName.equals(o.lName))
            return fName.compareTo(o.fName);
        return lName.compareTo(o.lName);
    }
    
    @Override
    public String toString() { return fName + lName; }
}

public class J07071 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Name> names = new ArrayList<>();
        while (n --> 0) 
            names.add(new Name(sc.nextLine()));
        
       names.sort((n1, n2)->n1.nameCompare(n2));
       n = sc.nextInt();
        while (n --> 0) {
            String bief = sc.next();
            names.forEach(e->{
                if (e.matchName(bief))
                    System.out.println(e);
            });
        }
    }
}
