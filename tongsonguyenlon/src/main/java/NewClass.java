import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            int length;
            if(s1.length()>s2.length())
                length=s1.length();
            else length=s2.length();
            char[] string1=s1.toCharArray();
            char[] string2=s2.toCharArray();
            int re=0;
            String res="";
            for(int i=length-1;i>=0;i--) {
                
            }
        }
    }
}
