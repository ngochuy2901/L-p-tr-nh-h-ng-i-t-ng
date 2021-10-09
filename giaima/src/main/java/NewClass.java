import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->=0) {
            String myString =sc.nextLine();
            char stringArr[] = myString.toCharArray();
            for(int i=1;i<myString.length();i++) {
                if(stringArr[i]>='1'&&stringArr[i]<='9') {
                    int count=stringArr[i]-'0';
                    for(int j=0;j<count;j++)
                        System.out.print(stringArr[i-1]);
                }
                    
            }
            System.out.println();
        }
    }
}
