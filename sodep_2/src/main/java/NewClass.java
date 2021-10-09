import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s=sc.nextLine();
            boolean x2=false;
            String s2="";
            int count=0;
            for(int i=s.length()-1;i>=0;i--) {
                s2 = s2 + s.charAt(i);
                count+=s.charAt(i)-'0';
            } 
            boolean x1=s.equals(s2);
            if(count%10==0)
                x2=true;
            boolean x3=false;
            if(s.charAt(0)=='8'&&s.charAt(s.length()-1)=='8')
                x3=true;
            if(x1&&x2&&x3)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
