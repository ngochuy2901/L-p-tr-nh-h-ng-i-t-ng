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
public class NewClass {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <nhanvien> a = new ArrayList<>();
        for(int i=0;i<n;i++) {
            nhanvien x = new nhanvien(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(x);
        }
        Collections.sort(a);
        for(nhanvien i:a)
            System.out.println(i);
    }
}
