
package chuivihinhchunhat;
import java.util.Scanner;
/**
 *
 * @author huy
 */
public class Chuivihinhchunhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=0||b<=0)
                System.out.println(0);
        else  {
            System.out.println((2*(a+b)) + " " + a*b);
        }
    }
    
}
