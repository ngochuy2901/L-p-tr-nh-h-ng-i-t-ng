/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monney;

import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        product[] thanhtoan = new product[n];
        for(int i=0;i<n;i++) {
            thanhtoan[i].input();
            thanhtoan[i].calculate();
            thanhtoan[i].output();      
        }
    }
}
