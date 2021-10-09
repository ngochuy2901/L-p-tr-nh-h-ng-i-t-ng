package pakage1;

import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Student [] listStudent = new Student[n];
        for(int i = 0 ;i<n;i++) {
            listStudent[i] = new Student();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String birth = sc.nextLine();
            float score = sc.nextFloat();
            listStudent[i].studentId = "B20DCCN" + (i+1);
            listStudent[i].input(name,className,birth,score);
        }
            
            
    }
}
