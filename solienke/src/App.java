import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            boolean check = true;
            for(int i=0;i<s.length()-1;i++) {
                if(Math.abs(s.charAt(i)-s.charAt(i+1))!=1) {
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.println("YES");
            else 
                System.out.println("NO");

        }
    }
}
