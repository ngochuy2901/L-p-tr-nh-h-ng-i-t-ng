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
public class Project {
    public static void main(String[] args) throws ParseException {
        ArrayList<Student> ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i=1;i<=n;i++){
            Student tmp = new Student(i,in.nextLine(),in.nextLine(),in.nextLine(), Float.parseFloat(in.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(Student tmp : ds){
            System.out.println(tmp);
        }
    }
}
