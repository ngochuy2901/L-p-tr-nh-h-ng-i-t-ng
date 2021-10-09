public class tamgiac {
    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();
    private double x,y,z;
    
    
    
    public tamgiac(Point a,Point b,Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = a.distance(a,b);
        this.y = a.distance(a,c);
        this.z = b.distance(b,c);
    }
    private boolean check() {      
        if(x+y>z || x+z>y || z+y>x)
            return true;
        else return false;
    }
    public void print() {
        if(check())
            System.out.println("INVALID");
        else System.out.printf("%.3f\n",x+y+z);
    }
}
