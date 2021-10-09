import java.util.Scanner;
import java.util.Arrays;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            long a[]= new long[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextLong();
            Arrays.sort(a);
            boolean test=false;
            for(int i=0;i<n-2;i++) {
                for(int j=i+1;j<n-1;j++) {
                    for(int k=j+1;k<n;k++) {
                        if(a[i]*a[i]+a[j]*a[j]==a[k]*a[k]) {
                            test=true;
                            break;
                        }
                        if(test==true)
                            break;
                    }
                    if(test==true)
                        break;
                }
            }
            if(test)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
