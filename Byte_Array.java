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
public class Byte_Array {
    public static void main(String args[])throws Exception{
  FileOutputStream fout1=new FileOutputStream("C://Users//DELL//Desktop//New folder//abc.txt");
  FileOutputStream fout2=new FileOutputStream("C://Users//DELL//Desktop//New folder//C.txt"); 
  ByteArrayOutputStream bout=new ByteArrayOutputStream();
  bout.write(139);
  bout.writeTo(fout1);
  bout.writeTo(fout2);
  bout.flush();
  bout.close();
  System.out.println("success...");
}}
    

  