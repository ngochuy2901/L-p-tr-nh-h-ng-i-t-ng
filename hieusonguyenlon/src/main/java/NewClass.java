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
public class NewClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        BigInteger x1=new BigInteger(a,10);
        BigInteger x2=new BigInteger(b,10);
        BigInteger x3 = x1.subtract(x2);
        System.out.println(x3);
    }
    
//    BigInteger a = new BigInteger();
}
