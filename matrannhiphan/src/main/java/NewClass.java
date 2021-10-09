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
        int n =sc.nextInt();
        int a[][] = new int[n][3];
        int so1=0;
        for(int i=0;i<n;i++) {
            int count1=0;
            for(int j=0;j<3;j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j]==1)
                    count1++;
   
            }
            if(count1>=2)
                so1++;
            
        }
        System.out.println(so1);
    }
}
