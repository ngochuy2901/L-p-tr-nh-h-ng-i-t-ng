/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiem;

/**
 *
 * @author huy
 */
import java.util.*;
import java.text.*;
public class diem implements Comparable<diem>{
    private String name,maHs;
    private float[] arr = new float[10];
    private float diemTb;
    private int x;
    public diem(int i,String name,float a[]) throws ParseException {
        this.maHs = "HS" + String.format("%02d",i);
        this.name = name;
        this.arr = a;
        tinhDiemTb();
        this.x = i;
    }
    private void tinhDiemTb() {
        this.diemTb = 0;
        this.diemTb = this.arr[0]*2+this.arr[1]*2;
        for(int i=2;i<10;i++)
            this.diemTb+=this.arr[i];
        this.diemTb/=12;
    }
    private String xeploai() {
        if(this.diemTb<5)
            return "YEU";
        else if(this.diemTb>=5&&this.diemTb<7)
            return "TB";
        else if(this.diemTb>=7&&this.diemTb<8)
            return "KHA";
        else if(this.diemTb>=8&&this.diemTb<9)
            return "GIOI";
        else return "XUAT SAC";
    }
    @Override
    public int compareTo(diem o) {
        if(o.diemTb<this.diemTb)
            return -1;
        if(o.diemTb>this.diemTb)
            return 1;
        if(o.x<this.x)
            return -1;
        if(o.x<this.x)
            return 1;
        return 0;
    }
    @Override
    public String toString() {
        return this.maHs+" "+this.name+" " +String.format("%.1f",this.diemTb)+" "+xeploai();
    }
}
