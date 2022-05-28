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
public class Char_Array {
    public static void main(String args[])throws Exception{
  CharArrayWriter out=new CharArrayWriter();
  out.write("my name is");
 FileWriter f1=new FileWriter("C://Users//DELL//Desktop//New folder//abc.txt");
  FileWriter f2=new FileWriter("C://Users//DELL//Desktop//New folder//C.txt");
  FileWriter f3=new FileWriter("C://Users//DELL//Desktop//New folder//M.txt");
  FileWriter f4=new FileWriter("C://Users//DELL//Desktop//New folder//answers.txt");
  
  out.writeTo(f1);
  out.writeTo(f2);
  out.writeTo(f3);
  out.writeTo(f4);
  f1.close();
  f2.close();
  f3.close();
  f4.close();
 }
    
}   } 