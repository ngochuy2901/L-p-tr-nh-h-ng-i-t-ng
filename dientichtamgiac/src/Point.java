import java.lang.Math;
public class Point {
    private double x;
    private double y;
    public Point() {
       this.x = 0;
       this.y = 0; 
    }
    public Point(Point a) {
        this.x = a.x;
        this.y = a.y;
    }
    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double distance(Point secondPoint) {
        double res = Math.sqrt((this.x-secondPoint.x)*(this.x-secondPoint.x)+(this.y-secondPoint.y)*(this.y-secondPoint.y));
        return res;
    }
    public boolean inLine(Point a,Point b,Point c) {
        if((a.x==b.x && a.x==c.x) || (a.y==b.y && a.y==c.y))
            return true;
        else return false;
    }
    public double distance(Point a,Point b) {
        double res = Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
        return res;
    }
    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}