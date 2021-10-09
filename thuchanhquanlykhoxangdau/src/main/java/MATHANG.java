/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
public class MATHANG {
    
    private String ma,hangsx,tenhang;
    private String mathang;
    private double dongia;
    private double thue;
    private double soluong;
    private double thanhtien;
    private boolean quocgia;
    private double tienthue;
    public MATHANG(String ma,int soluong) {
        this.ma = ma;
        this.soluong = soluong;
    }
    private void xuly() {
        if(this.ma.charAt(0)=='X'){
            
            this.mathang = "Xang";
            if(this.ma.charAt(this.ma.length()-1)=='N'){
                this.thue = 0;
                this.quocgia = true;
            }
                
            else this.thue = 3;
            this.dongia = 128000;
        }
            
        if(this.ma.charAt(0)=='D'){
            this.mathang = "Dau";
            if(this.ma.charAt(this.ma.length()-1)=='N')
                this.thue = 0;
            else this.thue = 3.5;
            this.dongia = 11200;
        }
            
        if(this.ma.charAt(0)=='N'){
            this.mathang = "Nhot";
            if(this.ma.charAt(this.ma.length()-1)=='N')
                this.thue = 0;
            else this.thue = 2;
            this.dongia = 9700;
        }
        
        switch(this.ma.charAt(3)) {
            case 'B' :
                this.tenhang = "British Petro";
                break;
            case 'E' :
                this.tenhang = "Esso";
                break;
            case 'S' :
                this.tenhang = "Shell";
                break;
            case 'C' :
                this.tenhang = "Castrol";
                break;
            case 'M' :
                this.tenhang = "Mobil";
                break;
        }
        if(!this.quocgia) {
            this.tienthue = this.dongia*this.soluong*(this.thue/100);
            this.thanhtien = this.dongia*this.soluong + this.tienthue;
        }
        else this.thanhtien = this.dongia*this.soluong;
    }
    public void output() {
        xuly();
        System.out.print(this.ma + " " + this.tenhang + " "  );
        if(this.quocgia)
            System.out.print("Trong Nuoc");
        else System.out.print(this.tenhang + " "  );
        System.out.printf("%.0f %.0f %.0f",dongia,tienthue,thanhtien);
        System.out.println();
    }
}
