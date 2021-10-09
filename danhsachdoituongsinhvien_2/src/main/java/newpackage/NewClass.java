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
import java.text.ParseException;
import java.util.*;
public class NewClass {
    public static void main(String[] args) throws ParseException{
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for(int i=0;i<n;i++) {
            Student x = new Student(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));
            a.add(x);
        }
        for(Student i:a)
            System.out.println(i);
    }
}
