import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String myString =sc.nextLine();
            int length=myString.length();
            int count=0;
            for(int i=0;i<=length/2;i++) {
                if(myString.charAt(i)!=myString.charAt(length-1-i)) {
                    count++;
                }
            }
            if(length%2==1&&(count<=1))
                System.out.println("YES");
            else if(length%2==0&&count==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}
