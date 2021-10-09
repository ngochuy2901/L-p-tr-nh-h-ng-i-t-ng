import java.util.Scanner;
import java.lang.Math;
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            float h=sc.nextFloat();
            double h1=4*Math.sqrt((h/24));
            double h2=4*Math.sqrt(h/12);
            System.out.println(h1 + " "+h2);
            System.out.printf("%.6f\t%.6f", h1,h2);
        }
    }
}
