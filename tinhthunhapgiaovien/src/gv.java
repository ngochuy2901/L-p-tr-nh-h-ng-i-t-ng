public class gv {
    private String mangach;
    private String name;
    private int phucap,luongcb,bacluong,thunhap;
    public gv(String mangach,String hoten,int luongcb) {
        this.mangach = mangach;
        this.name = hoten;
        this.luongcb = luongcb;
    }
    private void tinhluong() {
        if(this.mangach.charAt(1)=='T')
            this.phucap = 2000000;
        else if(this.mangach.charAt(1)=='P')
            this.phucap = 900000;
        else this.phucap = 500000;
        
        String s = String.valueOf(this.mangach.charAt(2))+String.valueOf(this.mangach.charAt(3));
        this.bacluong = Integer.parseInt(s);
        this.thunhap = this.luongcb*this.bacluong + this.phucap;
    }
    public void print() {
        tinhluong();
        System.out.println(this.mangach + " " + this.name + " " + this.bacluong + " " + this.phucap + " " + this.thunhap);
    }
}
    
