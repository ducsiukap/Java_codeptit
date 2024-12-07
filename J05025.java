import java.util.*;

class GV0525 {
    private static int sID = 1;
    private int id;
    private String fName, lName, ngh;

    public GV0525(String name, String ngh) {
        id = sID++;
        String Name[] = name.split("\\s+");
        fName = "";
        for (int i = 0; i < Name.length; ++i) 
            if (i + 1 == Name.length)
                lName = Name[i];
            else fName += Name[i] + " ";
        this.ngh = IDNganh(ngh);
    }
    
    private String IDNganh(String ngh) {
        String NGH[] = ngh.split("\\s+");
        String res = "";
        for (String w : NGH) res += Character.toUpperCase(w.charAt(0));
        return res;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return lName;
    }
    
    @Override
    public String toString() {
        return String.format("GV%02d %s%s %s", id, fName, lName, ngh);
    }
}
public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<GV0525> gvs = new ArrayList<>();
        while (n --> 0) gvs.add(new GV0525(sc.nextLine(), sc.nextLine()));
        gvs.sort((g1, g2) -> {
            if (g1.getName().equals(g2.getName()))
                return g1.getId()-g2.getId();
            return g1.getName().compareTo(g2.getName());
        });
        
        for (GV0525 g : gvs) System.out.println(g);
        sc.close();
    }
}