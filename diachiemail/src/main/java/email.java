/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
public class email {
    private String name;
    public void getValue(String s) {
        this.name = s;
    }
    public void getEmail() {
        name = name.trim();
        name = name.toLowerCase();
        while(name.indexOf("  ")!=-1) {
            name = name.replaceAll("  "," ");
        }
        String arr[] = name.split(" ");
        String str1="",str2="";
        int length = arr.length;
        for(int i=0;i<length-1;i++) {
            str2 += arr[i].charAt(0);
        }
        str1 =  arr[length-1] + str2 + "@ptit.edu.vn";
        this.name=str1;
    }
}
