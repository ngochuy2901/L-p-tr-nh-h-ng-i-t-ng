import java.util.Scanner;
public class student {
    String name;
    String birth;
    float point1,point2,point3,totolPoint;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        student newStudent = new student();
        newStudent.name=sc.nextLine();
        newStudent.birth=sc.nextLine();
        newStudent.point1=sc.nextFloat();
        newStudent.point2=sc.nextFloat();
        newStudent.point3=sc.nextFloat();
        newStudent.totolPoint=newStudent.point1 + newStudent.point2 + newStudent.point3;
        System.out.print(newStudent.name + " " + newStudent.birth + " ");
        System.out.printf("%.1f",newStudent.totolPoint);
    }
}
