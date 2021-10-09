/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainProject;

/**
 *
 * @author huy
 */
import java.util.Scanner;
public class employee {
    Scanner sc=new Scanner(System.in);
    private String id = "00001";
    private String name;
    private String sex;
    private String birth;
    private String address;
    private String taxCode;
    private String contractDay;
    public void input() {
        String name=sc.nextLine();
        String sex=sc.nextLine();
        String birth=sc.nextLine();
        String address=sc.nextLine();
        String taxCode=sc.nextLine();
        String contractDay=sc.nextLine();
        
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDay = contractDay;
    }
    public void output() {
        System.out.print(this.id + " ");
        System.out.print(this.name + " ");
        System.out.print(this.sex + " ");
        System.out.print(this.birth + " ");
        System.out.print(this.address + " ");
        System.out.print(this.taxCode + " ");
        System.out.print(this.contractDay + " ");
    }
    public void convertBirthDay() {
        String day = "";
        String month="";
        String year="";
        int pos=0;
        for(int i=pos;i<birth.length();i++) {
            if(birth.charAt(i)=='/') {
                pos=i+1;
                break;
            }       
            else day = day + birth.charAt(i);
        }
        for(int i=pos;i<birth.length();i++) {
            if(birth.charAt(i)=='/') {
                pos=i+1;
                break;
            }       
            else month = month + birth.charAt(i);
        }
        for(int i=pos;i<birth.length();i++) {
            year+=birth.charAt(i);
        }
        if(day.length()==1)
            day = '0' + day;
        if(month.length()==1)
            month = '0' + month;
        this.birth = day + '/' + month + '/' + year;
    }
    public void convertContractDay() {
        String day = "";
        String month="";
        String year="";
        int pos=0;
        for(int i=pos;i<contractDay.length();i++) {
            if(contractDay.charAt(i)=='/') {
                pos=i+1;
                break;
            }       
            else day = day + contractDay.charAt(i);
        }
        for(int i=pos;i<contractDay.length();i++) {
            if(contractDay.charAt(i)=='/') {
                pos=i+1;
                break;
            }       
            else month = month + contractDay.charAt(i);
        }
        for(int i=pos;i<contractDay.length();i++) {
            year+=contractDay.charAt(i);
        }
        if(day.length()==1)
            day = '0' + day;
        if(month.length()==1)
            month = '0' + month;
        this.contractDay = day + '/' + month + '/' + year;
    }
}
