import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long fibo[]= new long[101];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=3;i<100;i++)
            fibo[i]=fibo[i-1]+fibo[i-2];
        int t=sc.nextInt();
        while(t-->0) {
            long n=sc.nextLong();
            boolean check=false;
            for(int i=0;fibo[i]<=n;i++) {
                if(fibo[i]==n) {
                    check=true;
                    break;
                }         
            }
            if(check)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
