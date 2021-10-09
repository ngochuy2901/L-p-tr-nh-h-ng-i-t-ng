/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

public class Phanso {
    private long tu;
    private long mau;
    Scanner sc=new Scanner(System.in);
    public void nhap() {      
        long tuso=sc.nextLong();
        long mauso=sc.nextLong();
        this.tu=tuso;
        this.mau=mauso;
    }
    private long ucln() {
        long tuso=this.tu;
        long mauso=this.mau;
        while(mauso!=0) {
            long tmp = tuso % mauso;
            tuso = mauso;
            mauso = tmp;
        }
        return tuso;
    }
    public void rutGon() {
        long a = this.ucln();
        this.tu/=a;
        this.mau/=a;
    }
    public void xuat() {
        System.out.println(this.tu + "/" + this.mau);
    }
}
