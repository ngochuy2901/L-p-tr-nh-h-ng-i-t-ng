import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            // Point a = new Point();
            // Point b = new Point();
            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point a = new Point(x1,x2);
            Point b = new Point(y1,y2);
            System.out.printf("%.4f\n",a.distance(b));
           
        }
    }

}
