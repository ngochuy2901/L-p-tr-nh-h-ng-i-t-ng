/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author huy
 */
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int num=0;
        for(int i=0;i<n.length();i++) {
            if(n.charAt(i)=='4' || n.charAt(i)=='7')
                num++;
        }
        if(num==4||num==7)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
