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
import java.math.BigInteger;
public class tongsonguyenlon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            BigInteger x1 = sc.nextBigInteger();
            BigInteger x2 = sc.nextBigInteger();
            System.out.println(x1.add(x2));
        }
    }
}
