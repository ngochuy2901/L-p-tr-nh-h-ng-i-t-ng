/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
import java.util.*;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            String arr[] = s.split("\\s");
            for(int i=0;i<arr.length;i++) {
                for(int j=arr[i].length()-1;j>=0;j--) {
                    System.out.print(arr[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
