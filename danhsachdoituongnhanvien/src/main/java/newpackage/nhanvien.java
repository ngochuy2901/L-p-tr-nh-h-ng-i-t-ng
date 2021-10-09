/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.*;
import java.text.*;
/**
 *
 * @author huy
 */
public class nhanvien {
    private String id,name,sex,address;
    private Date birth,date;
    private String taxCode;
    public nhanvien(int i,String name,String sex,String birth,String address,String taxCode,String date)throws ParseException {
        this.id = String.format("%05d",i);
        this.name = name;
        this.sex = sex;
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.address = address;
        this.taxCode = taxCode;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }
    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.sex+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.birth)+" "+this.address+" "+this.taxCode+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.date);
    }
}
