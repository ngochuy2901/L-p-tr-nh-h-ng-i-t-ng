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
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            int count = 0;
            boolean check = true;
            for(int i=0;i<s.length();i++) {
                count+=s.charAt(i)-'0';
            }
            for(int i=0;i<s.length()-1;i++) {
                if(Math.abs(s.charAt(i)-s.charAt(i+1))!=2) {
                    check = false;
                    break;
                }
            }
            if(check && (count%10==0))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
