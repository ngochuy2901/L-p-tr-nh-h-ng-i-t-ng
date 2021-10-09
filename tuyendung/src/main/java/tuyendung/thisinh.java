/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuyendung;
import java.util.Scanner;
public class thisinh {
    Scanner sc=new Scanner(System.in);
    private int t;
    public String id;
    private String fullName;
    private float methodPoint;
    private float practicePoint;
    private float mPoint;
    public String res;
    public void input() {
        String name=sc.nextLine();
        float point1=sc.nextFloat();
        float point2=sc.nextFloat();
        if(point1>10)
            point1/=10;
        if(point2>10)
            point2/=10;
        this.fullName = name;
        this.methodPoint = point1;
        this.practicePoint = point2;
        this.mPoint = (point1+point2)/2;
        if(mPoint<5)
            this.res = "TRUOT";
        else if(mPoint>=5&&mPoint<8)
            this.res = "CAN NHAC";
        else if(mPoint>=8&&mPoint<9.5)
            this.res = "DAT";
        else this.res = "XUAT SAC";
    }
    public void output() {
        System.out.print(this.fullName + " ");
        System.out.print(this.mPoint + " ");
        System.out.println(this.res);
    }
    
}
