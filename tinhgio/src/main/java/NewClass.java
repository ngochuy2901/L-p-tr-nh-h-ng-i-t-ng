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
import java.text.*;

public class NewClass {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <gamethu>  a = new ArrayList<>();
        for(int i=0;i<n;i++) {
            gamethu x = new gamethu(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        for(gamethu i:a)
            System.out.println(i);
    }
}
