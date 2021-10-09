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
public class tuthuannghichdainhat {
    public static boolean thuannghich(String s) {
        String s2="";
        for(int i=s.length()-1;i>=0;i--) {
            s2 = s2+s.charAt(i);
        }
        return s.equals(s2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[] = str.split(" ");
        int length=0;
        String res="";
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(thuannghich(arr[i])) {
                if(arr[i].length()>length){
                    res = arr[i];
                    length=arr[i].length();
                    count=1;
                }
                else if(arr[i]==res)
                    count++;
            }                
        }
        
        System.out.println(res + " " + count);
    }
}
