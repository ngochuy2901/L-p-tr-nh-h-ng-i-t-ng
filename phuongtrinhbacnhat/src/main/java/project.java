import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=(-b/a);
        if(a==0&&b!=0)
            System.out.print("VN");
        else if(a==0&&b==0)
            System.out.print("VSN");
        
        else System.out.printf("%.2f",c);
    }
}
