import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]= {2,3,5,7,11,13,17};
        int num=1;
        while(t-->0) {
            System.out.print("Test " + num + ": ");
            num++;
            long n=sc.nextLong();
            while(n>1) {
                for(int i=0;i<7;i++) {
                    if(n%a[i]==0) {
                        int count=0;
                        while(n%a[i]==0) {
                            count++;
                            n/=a[i];
                        }
                        System.out.print(a[i]+"("+ count + ")" + " ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}


