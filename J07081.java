import java.io.*;
import java.util.*;

class SV7081{
    private String fName, mName, lName, id, tel, mail;
    
    public SV7081(String id, String name, String tel, String mail) {
        this.id = id;
        this.tel = tel;
        this.mail = mail;
        
        extractName(name);
    }
    
    private void extractName(String name) {
        String N[] = name.split("\\s+");
        fName = N[0];
        lName = N[N.length - 1];
        mName = " ";
        for (int i = 1; i < N.length - 1; ++i)
            mName += N[i] + " ";
    }
    
    public int compare(SV7081 o) {
        if (lName.equals(o.lName))
            if (fName.equals(o.fName))
                if (mName.equals(o.mName))
                    return id.compareTo(o.id);
                else return mName.compareTo(o.mName);
            else return fName.compareTo(o.fName);
        return lName.compareTo(o.lName);
    }
    
    @Override 
    public String toString() {
        return String.format("%s %s %s %s", id, 
                (fName + mName + lName), tel, mail);
    }
}

public class J07081 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV7081> al = new ArrayList<>();
        while (n --> 0) 
            al.add(new SV7081(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        al.sort((s1, s2)->s1.compare(s2));
        al.forEach(e->System.out.println(e));
        sc.close();
    }
}
