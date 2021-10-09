package pakage1;

/**
 *
 * @author huy
 */
public class Student {
    public String studentId;
    public String name;
    public String className;
    public String birth;
    public float score;
  
    public void input(String a,String b,String c,float d) {
        this.name = a;
        this.className = b;
        this.birth = c;
        this.score = d;
    }
    public void convertBirth() {
        String day = "";
        String month = "/";
        String year = "/";
        int pos = 0;
        for(int i=0;i<this.birth.length();i++) {
            if(this.birth.charAt(i) == '/') {
                pos = i+1;
                break;
            }
            day = day + this.birth.charAt(i);
        }
        if(day.length() == 1)
            day = '0' + day;
        for(int i=pos;i<this.birth.length();i++) {
            if(this.birth.charAt(i) == '/') {
                pos = i+1;
                break;
            }
            month = month + this.birth.charAt(i);
        }
        if(month.length() ==1)
            month = '0' + month;
        for(int i=pos;i<this.birth.length();i++)
            year = year + this.birth.charAt(i);
        this.birth = day + month + year;
    }
    public void output() {
        convertBirth();
        System.out.print(this.studentId + " "  + this.name + " " + this.className + " " + this.birth + " ");
        System.out.printf("%0.2f\n", this.score);
    }
}

