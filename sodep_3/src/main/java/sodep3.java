/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
import java.lang.Math;
import java.util.Scanner;
public class sodep3 {
    public static boolean snt(int n) {
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s=sc.nextLine();
            String s2="";
            boolean x2=true;
            for(int i=s.length()-1;i>=0;i--) {
                s2 = s2 + s.charAt(i);
                if(snt(s.charAt(i)-'0')==false)
                    x2=false;
            }
                
            boolean x1=s.equals(s2);
            if(x1&&x2)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
