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
public class Example_Read {
    public static void main(String args[])throws Exception{
FileInputStream fin=new FileInputStream("C://Users//DELL//Desktop//New folder//C.txt");
FileOutputStream fout=new FileOutputStream("C://Users//DELL//Desktop//New folder//M.txt");
int i=0;
while((i=fin.read())!=-1){
fout.write((byte)i);
}
fin.close();
}
}
    

