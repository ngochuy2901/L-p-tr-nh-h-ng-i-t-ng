
import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int count=1;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]>arr[j]) {
                    int tg=arr[i];arr[i]=arr[j];arr[j]=tg;                  
                }
            }
            System.out.print("Buoc "+ count + ": ");
                    for(int k=0;k<n;k++)
                        System.out.print(arr[k] + " ");
                    count++;
                    System.out.println();
        }
    }
}
