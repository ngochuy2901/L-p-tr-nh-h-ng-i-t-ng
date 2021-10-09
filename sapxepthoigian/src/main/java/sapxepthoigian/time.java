/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepthoigian;

/**
 *
 * @author huy
 */
public class time {
    public int hour,minute,second;
    public void input(int a,int b,int c) {
        this.hour = a;
        this.minute = b;
        this.second = c;
    }
    public void print() {
        System.out.println(hour + " " + minute + " " + second);
    }
}
