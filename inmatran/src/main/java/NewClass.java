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
        int t = sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int a[][] = new int[100][100];
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++)
                    a[i][j] = sc.nextInt();
            }
                
            for(int i=0;i<n;i++) {
                if(i%2==0) {
                    for(int j=0;j<n;j++)
                        System.out.print(a[i][j]+" ");

                }
                else if(i%2==1) {
                    for(int j=n-1;j>=0;j--)
                        System.out.print(a[i][j]+" ");

                }
            }
            System.out.println();
        }
    }
}
