import java.lang.Math;

public class tamgiac {
    private Point a,b,c;
    private boolean check() {
        if(a.distance(b)+a.distance(c)<=b.distance(c) || b.distance(a) + b.distance(c) <=a.distance(b) || c.distance(a)+c.distance(b) <=a.distance(b))
            return false;
        if(a.inLine(a,b,c))
            return false;
        return true;
    }
    public tamgiac(Point a,Point b,Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getArea() {
        
        if(check() == false)
            System.out.println("INVALID");
        else {
            double x1 = a.distance(b),x2=a.distance(c),x3 = b.distance(c);
            double res = (0.25) * Math.sqrt((x1+x2+x3)* (x1+x2-x3) * (x1-x2+x3) * (-x1+x2+x3));
            System.out.printf("%.2f\n",res);

        }
    }
}
