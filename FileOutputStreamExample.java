package com.cashapona.filesanddirectories.jun22;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author Anuradha
 */
public class FileOutputStreamExample {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		writeByte();
		writeString();
	}
	/*
	 * write byte data into the file
	 */
	public static void writeByte(){
		FileOutputStream fileOutput=null;
		try {
			fileOutput=new FileOutputStream("E:\\BasicTraining\\abcd.txt");
			fileOutput.write(64);
			fileOutput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Success...");
		}
	}
	/*
	 * write string data into the file
	 */
	public static void writeString() throws IOException{
		FileOutputStream fileOutput=new FileOutputStream("E:\\BasicTraining\\abcd.txt");
		try {
			String s= "Welcome to Java";
			byte[] b=s.getBytes();
			fileOutput.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			fileOutput.close();
			System.out.println("Success...");
		}
	}
}
