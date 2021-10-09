
package packet1;
import java.util.Scanner;

public class student {
    private String name;
    private String studentId = "B20DCCN001";
    private String className;
    private String birth;
    private float point;
    Scanner sc=new Scanner(System.in);
    public void input() {
        String name=sc.nextLine();
        String className=sc.nextLine();
        String birth=sc.nextLine();
        float point=sc.nextFloat();
        
        
        this.name=name;
        this.className=className;
        this.birth=birth;
        this.point=point;
    }
    public void convertDate()  {
        String day = "";
        String month="";
        String year="";
        int pos=0;
        for(int i=pos;i<birth.length();i++) {
            if(birth.charAt(i)=='/') {
                pos=i+1;
                break;
            }       
            else day = day + birth.charAt(i);
        }
        for(int i=pos;i<birth.length();i++) {
            if(birth.charAt(i)=='/') {
                pos=i+1;
                break;
            }       
            else month = month + birth.charAt(i);
        }
        for(int i=pos;i<birth.length();i++) {
            year+=birth.charAt(i);
        }
        if(day.length()==1)
            day = '0' + day;
        if(month.length()==1)
            month = '0' + month;
        this.birth = day + '/' + month + '/' + year;
    }
    public void output() {
        System.out.print(this.studentId + " ");
        System.out.print(this.name + " ");
        System.out.print(this.className + " ");
        System.out.print(this.birth + " ");
        System.out.printf("%.2f\t",this.point);
    }
}
