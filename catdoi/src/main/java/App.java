
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            char arr[] = s.toCharArray();
            boolean x = true;
            for(int i=0;i<arr.length;i++) {
                if(arr[i]=='0' || arr[i] =='1')
                    continue;
                else if(arr[i]=='8' || arr[i]=='9')
                    arr[i]='0';
                else {
                    x=false;
                    break;
                }
            }
            int index2=0;
            int index = s.length()-1;
            boolean x3 = false;
            for(index2=0;index2<s.length();index2++){
                if(arr[index2]!='0'){
                    x3 = true;
                    break;
                }
            }
            s="";
            boolean x2 = false;
            for(int i=index2;i<=index;i++)
                s=s+arr[i];
                if(x==false || x2 ==false || x3 == false)
                    System.out.println("INVALID");
                else if(x==true) {
                    for(int i=0;i<s.length();i++) {
                        if(s.charAt(i)=='1') {                         
                            System.out.println(s);
                            x2 = true;
                            break;
                        }
                    }
                }
                
                
        }
    }
}
