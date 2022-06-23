package com.cashapona.filesanddirectories.jun22;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Anuradha
 */
public class WriteReadGetFileExample {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
		writeFile();
		readFile();
		getFileInfo();
	}
	public static void readFile()  {
		File file=new File("E:\\Employee.txt");
	    try{
			Scanner scanner = new Scanner(file);
			 while (scanner.hasNextLine()) {
			        String data = scanner.nextLine();
			        System.out.println(data+"");
			 }
			 scanner.close();
	   }catch(Exception e) {
		   System.out.println(e);
	   }
	}
	public static void writeFile()  {
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter("E:\\Employee.txt");
			fileWriter.write("shree keerthana");
			fileWriter.write(" anuradha");
			fileWriter.write(" ravi kumar");
			fileWriter.close();
		}catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}finally {
			System.out.println("Successfully wrote shree keerthana into the file.");
		}
	}
	public static void getFileInfo() {
		File file=new File("E:\\Employee.txt");
		if(file.exists()) {
			System.out.println("Get file name using getName() : " + file.getName());
		    System.out.println("Absolute path: " + file.getAbsolutePath());
		    System.out.println("Writeable: " + file.canWrite());
		    System.out.println("Readable " + file.canRead());
		    System.out.println("File size in bytes " + file.length());
		    } else {
		      System.out.println("The file does not exist.");
		    }
		}
	}

