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
public class xaunhiphan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] a = new long[100];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<100;i++)
            a[i]=a[i-1]+a[i-2];
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            long k=sc.nextLong();
            while(n>2) {
                if(k<=a[n-2])
                    n-=2;
                else {
                    k-=a[n-2];
                    n-=1;
                }
            }
            if(n==1)
                System.out.println(0);
            else System.out.println(1);
        }
    }
}
