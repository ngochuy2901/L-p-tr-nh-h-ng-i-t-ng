/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author huy
 */
import java.util.*;
import java.text.*;
//public class Student {
//    
//}
class Student implements Comparable<Student>{
    private String ma, hoten, lop;
    private Date ns;
    private float gpa;

    public Student(int n, String hoten, String lop, String ns, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", n);
        this.hoten = chuanHoa(hoten);
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;
    }
    private String chuanHoa(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i=1;i<t.length();i++){
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(Student o) {
        if(this.gpa > o.gpa) return -1;
        if(this.gpa < o.gpa) return 1;
        return 0;
    }
    
}

