/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
public class Matrix {
    private int a[][] = new int[100][100];
    private int n,m;
    public Matrix(int n,int m) {
        this.n = n;
        this.m = m;
    }
    public void nextMatrix( sc) {
        for(int i=0;i<this.n;i++) {
            for(int j=0;j<this.m;j++)
                this.a[i][j] = sc.nextInt();
        }
    }
}
