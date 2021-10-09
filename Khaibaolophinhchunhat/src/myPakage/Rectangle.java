package myPakage;
public class Rectangle {
    private double width;
    private double height;
    private String color;

    public  Rectangle() {
        this.width = 1;
        this.height = 1;
    }
    public  Rectangle(double a, double b,String c) {
        this.width = a;
        this.height = b;
        this.color = c;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double a) {
        this.height = a;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color  = color;
    }
    public double findArea() {
        return this.height*this.width;
    }
    public double findPerimeter() {
        return 2*(this.height + this.width);
    }
    private void convert() {
        this.color = this.color.toLowerCase();
        char arr[] = this.color.toCharArray();
        arr[0]=Character.toUpperCase(arr[0]);
        this.color = String.valueOf(arr);
    }
    public void output() {
        convert();
        System.out.printf("%.0f %.0f %s",this.findPerimeter(),this.findArea(),this.color);
        // System.out.println(this.findPerimeter() + " " + this.findArea() + " " + this.color);
    }
}

