/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepthoigian;

/**
 *
 * @author huy
 */
import java.util.Arrays;
import java.util.Scanner;

public class project {
    public static boolean comp (time a,time b) {
        if(a.hour<b.hour)
            return true;
        if(a.hour==b.hour && a.minute<b.minute)
            return true;
        if(a.hour==b.hour && a.minute==b.minute && a.second<b.second)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        time[] arr = new time[n];
        for(int i=0;i<n;i++) {
            arr[i] = new time();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            arr[i].input(a,b,c);
        }
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++)
                if(!comp(arr[i],arr[j])) {
                    time x =arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
                    
        }
        for(int i=0;i<n;i++) 
            arr[i].print();
        
    }
}
