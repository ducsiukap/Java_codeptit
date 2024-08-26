/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
import java.util.Scanner;
class Human {
    private String name, birthDay;
    private float sub1, sub2, sub3;
    public void output() {
        System.out.print(this.name + " " + this.birthDay);
        System.out.printf(" %.1f\n", (this.sub1 + this.sub2 + this.sub3));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setSub1(float sub1) {
        this.sub1 = sub1;
    }

    public void setSub2(float sub2) {
        this.sub2 = sub2;
    }

    public void setSub3(float sub3) {
        this.sub3 = sub3;
    }
    
}
public class J04005 {
    public static void main(String[] args) {
        Scanner buf = new Scanner(System.in);
        
        Human datNgu = new Human();
        datNgu.setName(buf.nextLine());
        datNgu.setBirthDay(buf.nextLine());
        datNgu.setSub1(buf.nextFloat());
        datNgu.setSub2(buf.nextFloat());
        datNgu.setSub3(buf.nextFloat());
        
        datNgu.output();
    }
}