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
public class MAIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        s = s.toLowerCase();
        while(s.indexOf("  ")!=-1) 
            s = s.replaceAll("  "," ");
        char arr[] = s.toCharArray();
        int index = 0;
        
        String res = "";
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]=='.'||arr[i]=='?'||arr[i]=='!') {
                for(int j=index;j<=i;j++)
                    res = res + arr[j];
                char arr1[] = res.toCharArray();
                arr1[0]-=32;
                res = String.valueOf(arr1);
                System.out.println(res);
                res = "";
                index = i+1;
            }
            
        }
    }
}
