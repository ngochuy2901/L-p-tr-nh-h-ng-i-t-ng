import java.lang.*;
public class Point {
    private double x,y;
    public Point() {
        this.x=1;
        this.y=1;
    }
    public Point(double x,double y) {
        this.x=x;
        this.y=y;
    }
    public Point(Point o) {
        this.x = o.x;
        this.y = o.y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double distane(Point o) {
        return Math.sqrt((this.x-o.x)*(this.x-o.x)+(this.y-o.y)*(this.y-o.y));
    }
    public double distance(Point a,Point b) {
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }
    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}
