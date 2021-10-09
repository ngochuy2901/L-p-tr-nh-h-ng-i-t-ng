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
import java.math.BigInteger;
public class hieusonguyenlon1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b).abs(); 
            String s1=a.toString();
            String s2=b.toString();
            String s3=c.toString();
            int x1;
            int x2=s3.length();
            if(s1.length()>=s2.length())
                x1=s1.length();
            else x1=s2.length();
            if(x2<x1) {
                for(int i=0;i<x1-x2;i++)
                    System.out.print('0');
            }
               
            System.out.println(c);
            
        }
        
    }
}
