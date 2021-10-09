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
public class MAIN {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int test = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[100][100];
        int b[][] = new int[100][100];
        int c[][] = new int[100][100];
        for(int i=0;i<n;i++) 
            for(int j=0;j<m;j++){
                 a[i][j] = sc.nextInt();
                 b[j][i] = a[i][j];
            }
               
      
        for(int i=1;i<=test;i++) {
            System.out.println("Test " + i + ":");
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                c[i][j]=0;
                for(int k=0;k<m;k++) {
                    c[i][j]+= a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
