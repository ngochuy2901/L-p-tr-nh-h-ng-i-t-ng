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
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <nhanvien> arr = new ArrayList<>();
        for(int i =1;i<=n;i++) {
            nhanvien a = new nhanvien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(a);
        }
        for(nhanvien i:arr)
            System.out.println(i);
    }
}
