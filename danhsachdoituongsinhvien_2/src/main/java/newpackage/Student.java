
package newpackage;

import java.util.*;
import java.text.*;
public class Student {
    private String studentId,name,className;
    private Date birth;
    private float gpa;
    public String chuanhoa(String s) {
        s = s.trim();
        s = s.toLowerCase();
        while(s.indexOf("  ")!=-1)
            s = s.replaceAll("  ", " ");
        char arr[] = s.toCharArray();
        arr[0]-=32;
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1]==' ')
                arr[i]-=32;
        }
        return String.valueOf(arr);
    }
    public Student() {
        
        this.className = "";
        this.gpa = 0;
        this.studentId = "";
    }
    public Student(int i,String name,String className,String birth,float gpa)throws ParseException {
        this.studentId = "B20DCCN" + String.format("%03d",i);
        this.name = chuanhoa(name);
        this.gpa = gpa;
        this.className = className;
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
    }
    @Override
    public String toString() {
        return this.studentId+" "+this.name+" " +this.className+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.birth)+" "+String.format("%.2f",this.gpa);
    }
}
