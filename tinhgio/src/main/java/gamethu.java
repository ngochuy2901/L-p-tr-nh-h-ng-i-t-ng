/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
import java.util.*;
import java.text.*;
public class gamethu {
    private String name,id;
    private Date in,out;
    String time;
    public gamethu(String id,String name,String in,String out) throws ParseException {
        this.id = id;
        this.name = name;
        this.in = new SimpleDateFormat("hh/ss").parse(in);
        this.out = new SimpleDateFormat("hh/ss").parse(out);
        long x = this.out.getTime()-this.in.getTime();
        long h = x/3600,m=x%3600;
        this.time = String.valueOf(h) + ":" + String.valueOf(m);
    }
    @Override
    public String toString() {
        return id+" "+name+" "+time;
    }
}
