import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                if (name.equals("END")) 
                    break;
                String Name[] = name.trim().split("[ ]+");
                for (int i = 0; i < Name.length; ++i)
                    System.out.print(Name[i].substring(0, 1).toUpperCase() + 
                    Name[i].substring(1).toLowerCase() + " ");
                System.out.println();
            }
            sc.close();
        } catch (FileNotFoundException e) {}
    }
}
