package danhsachsinhvien1;

import java.util.*;
import java.io.*;

class Student0713 implements Serializable {
    private String id, name, sClass, dob;
    private float gpa;
    

    public Student0713(int id, String name, String sClass, String dob, float gpa) {
        this.id = String.format("B20DCCN%03d", id + 1); //0
        this.name = name;
        this.sClass = sClass;
        this.dob = stdDOB(dob);
        this.gpa = gpa;
        
    }
    
    private String stdDOB(String dob) {
        String DOB[] = dob.split("/");
        int dd, mm;
        dd = Integer.parseInt(DOB[0]);
        mm = Integer.parseInt(DOB[1]);
        return String.format("%02d/%02d/%s", dd, mm, DOB[3]);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", id, name, sClass, dob, gpa);
    }
}


public class J07013 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
    
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("SV.in"));
            ArrayList<Student0713> list = (ArrayList<Student0713>) in.readObject();
//            in.close();
            
            for (Student0713 student : list) 
                System.out.println(student);
        }catch(IOException _){} catch(ClassNotFoundException _) {}
//        sc.close();
    }
}