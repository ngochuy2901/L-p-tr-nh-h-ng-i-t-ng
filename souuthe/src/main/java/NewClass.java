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
        int t=sc.nextInt();
        
        
        while(t-->0) {
            boolean check = true;
            
            String s = sc.next();
            if(s.charAt(0)=='0')
                check = false;
            int chan=0,le=0;
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)>'9'||s.charAt(i)<'0') {
                    check = false;
                    break;
                }
                if((s.charAt(i)-'0')%2==0)
                    chan++;
                else le++;
            }
            if(check==false)
                System.out.println("INVALID");
            else if(((s.length()%2==0) && (chan>le)) || (s.length()%2==1) && (chan<le))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
