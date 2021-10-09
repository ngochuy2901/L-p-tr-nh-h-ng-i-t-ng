package monney;
import java.util.Scanner;

public class product {
    Scanner sc=new Scanner(System.in);
    private String codeProduct;
    private String name;
    private int number;
    private long cost;
    private long chietKhau;
    private long colMoney;
    public void input() {
        String codeProduct = sc.nextLine();
        String name = sc.nextLine();
        int number = sc.nextInt();
        long cost = sc.nextLong();
        long chietKhau = sc.nextLong();
        int colMoney = sc.nextInt();
        
        this.codeProduct = codeProduct;
        this.name = name;
        this.number = number;
        this.cost = cost;
        this.chietKhau = chietKhau;
    }
    public void calculate() {
        this.colMoney = this.cost*this.number - this.chietKhau;
    }
    public void output() {
        System.out.print(this.codeProduct + " ");
        System.out.print(this.name + " ");
        System.out.print(this.number + " ");
        System.out.print(this.cost + " ");
        System.out.print(this.chietKhau + " ");
        System.out.print(this.colMoney + " ");
    }
}
