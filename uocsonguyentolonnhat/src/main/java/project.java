import java.util.Scanner;
import java.lang.Math;
class check {
    public boolean checksnt (long n) {
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0)
                return false;
            
        }
        return true;
    }
}
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        check Check=new check();
        while(t-->0) {
            long n=sc.nextLong();
            if(Check.checksnt(n))
                System.out.println(n);
            
            else for(long i=(long) (Math.sqrt(n)*4);i>=2;i--) {
                if(n%i==0&&Check.checksnt(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
