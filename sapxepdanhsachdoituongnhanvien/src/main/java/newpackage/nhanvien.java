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
import java.util.*;
import java.text.*;

public class nhanvien implements Comparable<nhanvien> {
    private String id,name,sex,taxCode,address;
    private Date birth,taxDate;
    public nhanvien (int i,String name,String sex,String birth,String address,String taxCode,String taxDate) throws ParseException {
        this.id  = String.format("%05d",i);
        this.name = name;
        this.sex  = sex;
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.address = address;
        this.taxCode = taxCode;
        this.taxDate = new SimpleDateFormat("dd/MM/yyyy").parse(taxDate);
    }
    @Override
    public String toString() {
        return id+" "+name+" "+sex+" "+new SimpleDateFormat("dd/MM/yyyy").format(birth)+" "+address+" "+taxCode+" "+new SimpleDateFormat("dd/MM/yyyy").format(taxDate);
    }
    @Override
    public int compareTo(nhanvien o) {
        if(this.birth.compareTo(o.birth)<0)
            return -1;
        if(this.birth.compareTo(o.birth)>0)
            return 1;
        return 0;
    }
}
