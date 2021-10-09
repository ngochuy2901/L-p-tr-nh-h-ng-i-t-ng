import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int a[]=new int [n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++) {
            int pos=i;
            for(int j=i+1;j<n;j++) {
                if(a[j]<a[pos]) {
                    pos=j;
 
                }   
            }
            int tg=a[pos];
            a[pos]=a[i];
            a[i]=tg;
            System.out.print("Buoc " + count + ": " );
            count++;
            for(int j=0;j<n;j++)
                System.out.print(a[j] +" ");
            System.out.println();
        }
    }
}
