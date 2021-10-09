import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        List <Integer> a1 = new ArrayList <>();
        List <Integer> b1 = new ArrayList <>();
        List <Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        a1.add(a[0]);
        b1.add(b[0]);
        for(int i=1;i<n;i++) {
            if(a[i]==a[i-1])
                continue;
            else a1.add(a[i]);
        }
        for(int i=1;i<m;i++) {
            if(b[i]==b[i-1])
                continue;
            else b1.add(b[i]);
        }
        int index1=0,index2=0;
        while(index1<a1.size()&&index2<b1.size()) {
            if(a1.get(index1)<b1.get(index2))
                index1++;
            if(a1.get(index1)>b1.get(index2))
                index2++;
            if(a1.get(index1)==b1.get(index2)) {
                arr.add(a1.get(index1));
                index1++;
                index2++;     
            }
        }
        for(int i:arr)
            System.out.print(i+" ");
        
    }
}
