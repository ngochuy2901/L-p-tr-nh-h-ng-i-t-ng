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
    public static long giaithua(int n) {
    if(n==0||n==1)
        return 1;
    int x= 1;
    for(int i=1;i<=n;i++)
        x = x*i;
    return x;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long count = 0;
        for(int i=1;i<=n;i++)
            count+=giaithua(i);
        System.out.println(count);
    }
}
