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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String str = sc.nextLine();
            str = str.trim();//xóa khoảng trắng đầu cuối
            while(str.indexOf("  ")!=-1)
                str=str.replaceAll("  ", " "); //xóa khoảng tráng ở giữa
            str = str.toLowerCase();
            
            //viết hoa chữ cái đầu
            char[] newArr = str.toCharArray();
            for(int i=1;i<str.length();i++) {
                if(newArr[i-1]==' ') {    
                    newArr[i]-=32;
                }              
            }
            String str1 = String.valueOf(newArr);
            String strArray[] = str1.split(" ");
            strArray[0] = strArray[0].toUpperCase();
            for(int i=1;i<strArray.length-1;i++) {
                System.out.print(strArray[i] + " ");     
            }
            System.out.print(strArray[strArray.length-1] + ",");
            System.out.println( " " + strArray[0]);
        }
    }
}
