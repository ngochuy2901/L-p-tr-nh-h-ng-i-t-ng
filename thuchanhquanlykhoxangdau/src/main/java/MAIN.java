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
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        MATHANG arr[]= new MATHANG[n];
        for(int i=0;i<n;i++) {
            arr[i] = new MATHANG(sc.next(),Integer.parseInt(sc.next()));
        }
        for(int i=0;i<n;i++)
            arr[i].output();
    }
}
