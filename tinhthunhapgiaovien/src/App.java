import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // String s = String.valueOf('0')+String.valueOf('4');
        // System.out.println(Integer.parseInt(s));

        gv a = new gv(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        a.print();
    }
}
