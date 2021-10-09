import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=1;
        while(t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][] = new int [100][100];
            int b[][] = new int [100][100];
            int c[][] = new int [100][100];
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    a[i][j]=sc.nextInt();
                    b[j][i]=a[i][j];
                }
            }
            System.out.println("Test " + count + ":");
            count++;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    c[i][j]=0;
                    for(int l = 0; l < m; l++) {
                        c[i][j]+=a[i][l] * b[l][j];                    
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        }
        
}
