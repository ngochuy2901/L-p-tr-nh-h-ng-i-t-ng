import java.util.Scanner;

public class NewClass {
    public long m=1000000007;
    public static long sqr(long x){
        return x*x;
    }
    public static long pow(long a,long b) {
        if(b==0)
            return 1;
        if(b%2==0) {
            return sqr(pow(a,b/2));
        }
        else return a*sqr(pow(a,b/2));
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=1;
        while(t==1) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0&&b==0)
                break;
            System.out.println(pow(a,b));
        }
    }
}
