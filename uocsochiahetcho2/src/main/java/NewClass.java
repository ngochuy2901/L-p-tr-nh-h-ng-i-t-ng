import java.util.Scanner;
import java.lang.Math;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            long n=sc.nextLong();
            if(n<2||n%2==1) {
                System.out.println(0);
                continue;
            }
            int count=0,x=1;
            while(n%2==0) {
                count++;
                n/=2;
            }
            for(long i=3;i<=Math.sqrt(n);i+=2) {
                if(n%i==0)
                    ++x;
            }
            x=x*2;
            if((long)(Math.sqrt(n))*(long)(Math.sqrt(n))==n)
                --x;
            System.out.println(x*count);
        }
    }
}
