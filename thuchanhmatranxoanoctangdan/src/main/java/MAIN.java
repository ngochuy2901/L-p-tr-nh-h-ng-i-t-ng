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
import java.util.Arrays;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[]= new int[n*n];
        for(int i=0;i<n*n;i++)
            b[i] = sc.nextInt();
        Arrays.sort(b);
    }
}
