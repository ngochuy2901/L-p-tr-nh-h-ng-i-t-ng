
package bangdiem;


import java.util.*;
import java.text.*;
public class NewClass {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <diem> a = new ArrayList<>();
        for(int i=0;i<n;i++) {
            String name = sc.nextLine();
            float[]arr = new float[10];
            for(int j=0;j<10;j++)
                arr[j]=sc.nextFloat();
            sc.nextLine();
            diem x = new diem(i+1,name,arr);
            a.add(x);
        }
        Collections.sort(a);
        for(diem i:a)
            System.out.println(i);
    }
}
