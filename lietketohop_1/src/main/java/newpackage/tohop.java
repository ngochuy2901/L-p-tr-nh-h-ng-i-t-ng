/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author huy
 */
public class tohop {
    public int n,k;
    public int a[] = new int[15];
    public void input(int a,int b) {
        this.n=a;
        this.k=b;
    }
    public void print() {
        for(int i=1;i<=k;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
