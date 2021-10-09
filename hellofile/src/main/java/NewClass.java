/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huy
 */
import java.io.*;
import java.util.*;
public class NewClass {
    public static void main(String[] args) {
        try {
            File myObj = new File("Hello.txt");
            Scanner reader = new Scanner(myObj);
            while(reader.hasNextLine()) {
                String s = reader.nextLine();
                System.out.println(s);
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            
        }
    }
}
