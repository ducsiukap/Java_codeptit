import java.util.Scanner;

class Employee1 {
    private String eID, name, position;
    private int workingDay; //, id;
    private long basicSalary, salary, allowance, bonus;

    private void calculateSaraly() {
        basicSalary *= workingDay;

        switch (position.charAt(0)) {
            case 'G':
                allowance = 250000;
                break;
            case 'P':
                allowance = 200000;
                break;
            case 'T':
                allowance = 180000;
                break;
            default:
                allowance = 150000;
        }

        bonus = (workingDay >= 25) ? (basicSalary / 5) : ((workingDay >= 22) ? (basicSalary / 10) : 0);
        salary = basicSalary + allowance + bonus;
    }
    public Employee1(String name, long basicSalary, int workingDay, String position) {
        this.eID = "NV01";
        this.name = name;
        this.basicSalary = basicSalary;
        this.workingDay = workingDay;
        this.position = position;

        calculateSaraly();
    }

    @Override
    public String toString() {
        return (eID + " " + name + " " + basicSalary + " " + 
        bonus + " " + allowance + " " + salary);
    }
}

public class J04012 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        Employee1 e = new Employee1(buf.nextLine(), buf.nextLong(), buf.nextInt(), buf.next());
        System.out.println(e.toString());
        buf.close();
    }
}
