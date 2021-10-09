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
    public static boolean thuannghich(String s) {
        String tmp = "";
        for(int i=s.length()-1;i>=0;i--)
            tmp += s.charAt(i);
        if(s.equals(tmp))
            return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[] = {2,3,4,5,6,7,8,9};
        String arr[] = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        while(t-->0) {
            String s = sc.next().toUpperCase();
            String res = "";
            for(int i=0;i<s.length();i++) {
                for(int j=0;j<arr.length;j++) {
                    if(arr[j].indexOf(s.charAt(i))!=-1)
                        res += a[j];
                }
            }
            if(thuannghich(res))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
