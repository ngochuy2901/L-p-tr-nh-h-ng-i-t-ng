import java.util.Scanner;
import java.lang.Math;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0) {
            int m=sc.nextInt();
            boolean check=true;
            if(m<2)
                check=false;
            else 
            {
                for(int i=2;i<=Math.sqrt(m);i++) {
                    if(m%i==0) {
                        check=false;
                        break;
                    }

                }
            }
            if(check)
                System.out.println("YES");
            else System.out.println("NO");
            
            
        }
    }
}
