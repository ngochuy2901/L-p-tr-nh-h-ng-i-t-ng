/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
public class doanhnghiep implements Comparable<doanhnghiep>{
    private String id;
    private String name;
    private int numStudent;
    public doanhnghiep(String id,String name,int numStudent) {
        this.id = id;
        this.name = name;
        this.numStudent = numStudent;
    }
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.numStudent;
    }
    @Override
    public int compareTo(doanhnghiep o) {
        if(this.numStudent > o.numStudent)
            return -1;
        if(this.numStudent < o.numStudent)
            return 1;
        return 0;
    }
}
