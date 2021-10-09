/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
public class GIAOVIEN {
    private String mangach;
    private String hoten;
    private int luongcoban;
    private int bacluong;
    private int phucap;
    private int thunhap;
    public GIAOVIEN(String mangach,String hoten,int luongcoban) {
        this.mangach = mangach;
        this.hoten = hoten;
        this.luongcoban = luongcoban;
    }
    private void tinhluong() {
        switch(this.mangach.charAt(1)){
            case 'T':
                this.phucap = 2000000;
                break;
            case 'P':
                this.phucap = 900000;
                break;
            case 'V':
                this.phucap = 500000;
                break;
        }  
        String s = Character.toString(this.mangach.charAt(2)+ this.mangach.charAt(3));
        this.bacluong = Integer.parseInt(s);        
        this.thunhap = this.luongcoban * this.bacluong + this.phucap;
    }
    public void output() {
        tinhluong();
        System.out.println(mangach + " " + hoten +" " + bacluong +" " + phucap +" " + thunhap);
    }
}
