import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
 
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 
        Vector <Integer> number = new Vector<> ();
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            int a=sc.nextInt();
            number.add(a);
            System.out.print("Buoc " + (i+1) + ":");
            Collections.sort(number);
            for(int j=0;j<number.size();i++) {
                System.out.print(number.get(j) + " ");
            }
                
        }
    }
}
