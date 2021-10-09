import java.lang.Math;
public class Point {
    private double x;
    private double y;
    public Point() {
        this.x=1;
        this.y=1;
    }
    public Point(double x,double y) {
        this.x=x;
        this.y=y;
    }
    public Point(Point a) {
        this.x = a.x;
        this.y = a.y;
    }
    public double distance(Point a) {
        return Math.sqrt((this.x-a.x)*(this.x-a.x) + (this.y-a.y)*(this.y-a.y)); 
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}
