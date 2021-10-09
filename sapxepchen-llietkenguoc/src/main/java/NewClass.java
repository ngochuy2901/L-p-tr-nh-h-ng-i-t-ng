/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> res = new ArrayList<String>();
        int a[] = new int[n];
        int t,key,j;
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(int i=1;i<n;i++) {
            key = a[i];
            j=i-1;
            while(j>=0 && a[j] > key) {
                a[j+1] = a[j];
                j-=1;
            }
            a[j+1] = key;
            String tmp = "Buoc " +(i) + ":";
            for(int k=0;k<i;k++)
                tmp = tmp + " " + a[k];
            res.add(tmp);
        }
        Collections.reverse(res);
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
        
        
    }
}
