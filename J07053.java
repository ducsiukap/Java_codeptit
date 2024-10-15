import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class CandidateJ07053 {
    private static int no = 1;
    private String id, name;
    private double bonus;
    private int totalPoint, age;

    public CandidateJ07053(String name, String dob, double p1, double p2) {
        id = String.format("PH%02d", no);
        ++no;

        this.name = normalizationName(name.trim());
        this.age = calculateAge(dob);
        this.bonus = calculateBonusPoint(p1, p2);
        this.totalPoint = calculateTotalPoint(p1, p2, bonus);
    }

    private String normalizationName(String name) {
        String[] nameWords = name.split("\\s+");
        String out = "";
        for (String word : nameWords) {
            out = out.concat(" " + Character.toUpperCase(word.charAt(0))
                    + word.substring(1).toLowerCase());
        }
        return out.trim();
    }

    private int calculateAge(String dob) {
        return 2021 - Integer.parseInt(dob.substring(dob.length() - 4));
    }

    private double calculateBonusPoint(double p1, double p2) {
        double bonusPoint = 0.0;
        if (p1 >= 8.0 && p2 >= 8.0) bonusPoint = 1.0;
        else if (p1 >= 7.5 && p2 >= 7.5) bonusPoint = 0.5;
        return bonusPoint;
    }

    private int calculateTotalPoint(double p1, double p2, double bonus) {
        return (int)Math.min(10, Math.round((p1 + p2) / 2 + bonus));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + totalPoint + " " +
                (totalPoint >= 9 ? "Xuat sac" : (totalPoint == 8 ? "Gioi" : totalPoint == 7 ?
                        "Kha" : (totalPoint >= 5 ? "Trung binh" : "Truot")));
    }
}

public class J07053 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("XETTUYEN.in"));

            int n = Integer.parseInt(sc.nextLine());
            CandidateJ07053[] candidates = new CandidateJ07053[n];

            for (int i = 0; i < n; ++i)
                candidates[i] = new CandidateJ07053(sc.nextLine(), sc.nextLine(),
                        Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));

            for (CandidateJ07053 candidate : candidates)
                System.out.println(candidate);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Hello World!");
        }
    }
}