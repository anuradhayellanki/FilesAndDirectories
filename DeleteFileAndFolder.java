package com.cashapona.filesanddirectories.jun23;
import java.io.File;
/**
 * @author Anuradha
 * 
 */
public class DeleteFileAndFolder {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		deleteFile();
		deleteFolder();
	}
	public static void deleteFile() {
		File file=new File("E:\\sample.txt");
		if(file.delete()) {
			System.out.println("Deleted the file : "+file.getName());
		}else {
		      System.out.println("Failed to delete the file.");
		}
		System.out.println("length() of the file : "+file.length());
		System.out.println("path() of the file : "+file.getAbsolutePath());
	}
	public static void deleteFolder() {
		File file=new File("E:\\Employee\\Employee.txt");
		if(file.delete()) {
			System.out.println("Deleted the folder : "+file.getName());
		}else {
		      System.out.println("Failed to delete the folder");
		}
	}
}
