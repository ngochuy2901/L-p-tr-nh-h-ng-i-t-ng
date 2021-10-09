/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
import java.util.*;
import java.text.*;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <doanhnghiep> arr = new ArrayList <> ();
        for(int i=0;i<n;i++) {
            doanhnghiep a = new doanhnghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            arr.add(a);
        }
        Collections.sort(arr);
        for(doanhnghiep i:arr) 
            System.out.println(i);
    }
}
