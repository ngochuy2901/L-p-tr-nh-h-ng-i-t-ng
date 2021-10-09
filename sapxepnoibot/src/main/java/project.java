import java.util.Scanner;
public class project {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        boolean haveSwap=false;
        int count=1;
        for(int i=0;i<n-1;i++) {
            haveSwap=false;
            for(int j=0;j<n-i-1;j++) {
                if(a[j]>a[j+1]) {
                    int tg=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tg;
                    haveSwap=true;
                }
            }
            if(haveSwap==false)
                break;
            System.out.print("Buoc " + count + ": ");
            count++;
            for(int j=0;j<n;j++)
                System.out.print(a[j] +" ");
            System.out.println();
        }
        
        
    }
}
