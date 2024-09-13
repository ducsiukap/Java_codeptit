import java.util.Scanner;


class Employee {
    private String id, name, sex, dob, address, taxCode, signedDate;

    Employee() { this.id = "00001"; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getTaxCode() { return taxCode; }
    public void setTaxCode(String taxCode) { this.taxCode = taxCode; }

    public String getSignedDate() { return signedDate; }
    public void setSignedDate(String signedDate) { this.signedDate = signedDate; }

    @Override
    public String toString() {
        return (id + " " + name + " " + sex + " " + dob + " " + 
        address + " " + taxCode + " " + signedDate);
    }
}

public class J04007 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        Employee e = new Employee();
        e.setName(buf.nextLine());
        e.setSex(buf.nextLine());
        e.setDob(buf.nextLine());
        e.setAddress(buf.nextLine());
        e.setTaxCode(buf.nextLine());
        e.setSignedDate(buf.nextLine());

        System.out.println(e.toString());
        buf.close();
    }
}
