import java.util.Scanner;
import java.util.Arrays;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String number =sc.next();
            long count1=0,count2=0;
            int length=number.length();
            char []arr = number.toCharArray();
            for(int i=0;i<number.length();i++) {
                if(i%2==0)
                    count1+=arr[i]-'0';
                else count2+=arr[i]-'0';
            }
            if((count1-count2)%11==0)
                System.out.println(1);
            else System.out.println(0);
        }
    }
}
