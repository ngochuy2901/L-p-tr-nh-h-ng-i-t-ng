import java.util.Scanner;
import java.util.Stack;
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack <Character> data = new Stack <>();
        Stack <Character> res = new Stack <>();
        for(int i=0;i<s.length();i++) {
            data.push(s.charAt(i));
        }
        char a = data.pop();
        while(data.size()>0) {
            if(data.peek()!=a) {
                res.push(a);
                a=data.pop();
            }
            if(data.peek()==a) {
                while(a==data.peek())
                    data.pop();
                a=data.pop();
            }
        }
        String kq=res.toString();
        System.out.println(res);
    }
}
