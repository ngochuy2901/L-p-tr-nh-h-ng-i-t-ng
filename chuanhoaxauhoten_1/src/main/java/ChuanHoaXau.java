import java.util.Scanner;
public class ChuanHoaXau {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String str = sc.nextLine();
            str=str.trim();    
            str = str.toLowerCase();
            while(str.indexOf("  ")!=-1)
                str=str.replaceAll("  ", " ");
//            String newStr = "";
            char [] newStr = str.toCharArray(); 
            if(newStr[0]>='a'&&newStr[0]<='z')
                newStr[0]-= 32;
            for(int i=1;i<str.length();i++) {
                
                if(newStr[i-1]==' ')
                    if(newStr[i]>='a'&&newStr[i]<='z')
                        newStr[i]-=32;
            }
            String res=String.valueOf(newStr);
            System.out.println(res);
        }  
    }
}
