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
import java.lang.Math;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int count = 0;
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            for(int i=0;i<n-1;i++) {
                for(int j=i+1;j<n;j++) {
                    if(Math.abs(a[i]-a[j])<m)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
