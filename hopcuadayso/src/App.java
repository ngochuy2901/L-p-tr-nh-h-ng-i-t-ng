import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[] = new int[n+m];
        for(int i=0;i<n+m;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        System.out.print(a[0] + " ");
        for(int i=1;i<n+m;i++){
            if(a[i]==a[i-1])
                continue;
            else System.out.print(a[i] + " ");
        }
    }
}
