import java.util.*;
import java.text.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());    
        ArrayList <doanhnghiep> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            doanhnghiep a = new doanhnghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(a);
        }
        Collections.sort(arr);
        for(doanhnghiep a : arr) 
            System.out.println(a);
    }
}
