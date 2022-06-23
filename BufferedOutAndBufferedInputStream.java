package com.cashapona.filesanddirectories.jun23;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author Anuradha
 */
public class BufferedOutAndBufferedInputStream {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		try {
			bufferedInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bufferedOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} 
	/*
	 * writing the textual information in the BufferedOutputStream object which is 
	 * connected to the FileOutputStream object.
	 */
	public static void bufferedOutputStream() throws IOException {
		FileOutputStream fileOutputStream=new FileOutputStream("E:\\text.txt");    
	     BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);    
	     String s="Welcome to Java World.";    
	     byte b[]=s.getBytes();    
	     bufferedOutputStream.write(b);    
	     bufferedOutputStream.flush();    
	     bufferedOutputStream.close();    
	     fileOutputStream.close();    
	     System.out.println("success...");    
	}
	public static void bufferedInputStream() throws IOException {
		FileInputStream fileInputStream=new FileInputStream("E:\\text.txt");    
	    BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);    
	    int i;    
	    while((i=bufferedInputStream.read())!=-1){    
	     System.out.print((char)i);    
	    }    
	    bufferedInputStream.close();    
	    fileInputStream.close();    
	  }
}
 
