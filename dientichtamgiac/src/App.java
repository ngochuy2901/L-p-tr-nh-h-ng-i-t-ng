import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();
       while(test-->0) {
            Point a = new Point(Double.parseDouble(sc.next()),Double.parseDouble(sc.next()));
            Point b = new Point(Double.parseDouble(sc.next()),Double.parseDouble(sc.next()));
            Point c = new Point(Double.parseDouble(sc.next()),Double.parseDouble(sc.next()));
            tamgiac x = new tamgiac(a,b,c);
            x.getArea();
       }
    }
}
