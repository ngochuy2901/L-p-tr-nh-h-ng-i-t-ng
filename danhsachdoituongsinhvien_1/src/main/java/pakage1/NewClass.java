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
public class NewClass {
    public static void main(String[] args)throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        ArrayList <Student> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            Student a = new Student(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));  
            arr.add(a);
        }
        for(Student i:arr)
            System.out.println(i);
    }
    
}
