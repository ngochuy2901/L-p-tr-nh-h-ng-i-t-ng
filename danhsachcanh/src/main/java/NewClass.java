import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int [n+1][n+1];
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n;j++) {
                if(arr[i][j]==1) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}