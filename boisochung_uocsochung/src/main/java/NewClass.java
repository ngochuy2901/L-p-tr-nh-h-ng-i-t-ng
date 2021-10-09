import java.util.Scanner;
public class NewClass {
    public static void print(long a,long b) {
        long tich=a*b;
        while(a!=b) {
            if(a>b)
                a-=b;
            else b-=a;
        }
        System.out.println( tich/a + " " + a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            print(a,b);
        }
    }
}
