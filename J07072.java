import java.io.*;
import java.util.*;

class Name7072 {
    private String fName, lName;

    public Name7072(String name) {
        String w[] = name.trim().split("\\s+");
        lName = stdWord(w[w.length - 1]);
        fName = "";
        for (int i = 0; i < w.length - 1; ++i)
            fName += stdWord(w[i]) + " ";
    }
    
    private String stdWord(String w) { 
        return Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase();
    }
    
    public int nameCompare(Name7072 o) {
        if (lName.equals(o.lName))
            return fName.compareTo(o.fName);
        return lName.compareTo(o.lName);
    }
    
    @Override
    public String toString() { return fName + lName; }
}

public class J07072{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name7072> names = new ArrayList<>();
        while (sc.hasNext()) 
            names.add(new Name7072(sc.nextLine()));
        
       names.sort((n1, n2)->n1.nameCompare(n2));
       names.forEach(n->System.out.println(n));
    }
}
