import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int a[]=new int [n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Vector <Integer> sort= new Vector <>();
        for(int i=0;i<n;i++) {
            System.out.print("Buoc " + count + ": ");
            count++;
            sort.add(a[i]);
            Collections.sort(sort);
            for(int j=0;j<sort.size();j++)
                System.out.print(sort.get(j)+ " ");
            System.out.println();
        }
       }
    
}
