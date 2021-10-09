import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            long count=0;
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
                count+=a[i];
            }
            int countLeft=0;
            count=count-a[0];
            boolean test=false;
            for(int i=1;i<n;i++) {
                countLeft+=a[i-1];
                count-=a[i];
                if(count==countLeft) {
                    System.out.println(i+1);
                    test=true;
                    break;
                }
            }
            if(!test)
                System.out.println(-1);
            
        }
    }
}
