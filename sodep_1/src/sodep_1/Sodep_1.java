
package sodep_1;
import java.util.Scanner;


public class Sodep_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {  
            String s=sc.nextLine();
            boolean x2;
            
            x2=true;
            String s2="";
            for(int i=s.length()-1;i>=0;i--)
                s2 = s2 + s.charAt(i);
            for(int i=0;i<s.length();i++)
                if((s.charAt(i)-'0')%2==1){
                    x2=false;
                    break;
                }
            boolean x1=s.equals(s2);
            if(x1&&x2)
                System.out.println("YES");
            else System.out.println("NO");
        }
      
    }
 
}
