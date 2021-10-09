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
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[] = new int[150];
        int count = 0;
        for(int i=0;i<150;i++)
            a[i]=0;
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
        }
        for(int i=0;i<150;i++) {
            if(a[i]!=0)
                count++;
        }
        System.out.println(count);
    }
}
