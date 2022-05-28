/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaIO;
import java.io.*;

/**
 *
 * @author DELL
 */
public class Java_Input_Stream {
    
    public static void main(String args[]){
   try{
    FileOutputStream fout=new FileOutputStream("C://Users//DELL//Desktop//New folder//abc.txt");
    String s="Sachin Tendulkar is my favourite player";
    byte b[]=s.getBytes();//converting string into byte array 
    fout.write(b);
    fout.close();
    System.out.println("success...");
    }catch(Exception e){System.out.println(e);}
}
}
        