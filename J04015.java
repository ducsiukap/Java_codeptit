import java.util.Scanner;

class Teacher {
    private String id, name;
    private long baseSalary, allowance, salary;
    private int fact;

    private void calculateSalary() {
        if (id.charAt(0) == 'H') allowance = (id.charAt(1) == 'T' ? 2000000 : 900000);
        else allowance = 500000;

        fact = 10 * (id.charAt(2) - '0') + (id.charAt(3) - '0');
        salary = baseSalary * fact + allowance;
    }

    public Teacher(String id, String name, long baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;

        calculateSalary();
    }

    @Override
    public String toString() { 
        return (id + " " + name + " " + fact + " " + 
        allowance + " " + salary);
    }
}

public class J04015 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        Teacher a = new Teacher(buf.nextLine(), buf.nextLine(), buf.nextLong());
        System.out.println(a.toString());

        buf.close();
    }
}
