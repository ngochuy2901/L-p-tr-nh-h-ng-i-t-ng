package myPakage;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color  = sc.next();
        Rectangle a = new Rectangle(width,height,color);   
        if(a.getWidth()<=0 || a.getHeight() <=0)
            System.out.println("INVALID");
        else a.output();
    }
}
