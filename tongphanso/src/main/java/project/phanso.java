/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author huy
 */
import java.util.Scanner;
public class phanso {
    private long tu1,mau1,tu2,mau2,tu,mau;
    Scanner sc = new Scanner(System.in);
    public void input() {
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        
        this.tu1 = tu1;
        this.mau1 = mau1;
        this.tu2 = tu2;
        this.mau2 = mau2;  
        this.tu = tu1*mau2+tu2*mau1;
        this.mau = mau1*mau2;
    }
    private long ucln() {
        long a = this.tu;
        long b = this.mau;
        while(b!=0) {
            long tmp = a % b;
            a = b;
            b = tmp;
            
        }
        return a;
        
    }
    public void output() {
        long a = ucln();
        this.tu/=a;
        this.mau/=a;
        System.out.println(this.tu + "/" + this.mau);
    }
}
