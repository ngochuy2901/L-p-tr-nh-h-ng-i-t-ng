import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0) {
            Point a = new Point(Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            Point b = new Point(Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            Point c = new Point(Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            tamgiac x = new tamgiac(a,b,c);
            x.print();
        }
    }
}
