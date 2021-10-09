/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakage1;

/**
 *
 * @author huy
 */
import java.util.*;
import java.text.*;
public class Student  {
    private String studentId,name,className;
    private Date date;
    private float gpa;
    public Student(int n,String name,String className,String date,float gpa) throws ParseException  {
        this.studentId = "B20DCCN" + String.format("%03d",n);
        this.className = className;
        this.name = name;
        this.date =  new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }
    public void print() {
        System.out.print(this.studentId + " " + this.name + " " +this.className + " " + this.date + " ");
        System.out.printf("%0.2f\n",this.gpa);
    }
    @Override
    public String toString() {
        return this.studentId+" "+this.name+" "+this.className+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.date)+" "+String.format("%.2f",this.gpa);
    }
}
