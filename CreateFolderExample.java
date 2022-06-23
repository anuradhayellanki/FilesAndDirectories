package com.cashapona.filesanddirectories.jun23;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Anuradha
 */
public class CreateFolderExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		createFolder();
		try {
			createFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createDirectoryAndSubDirectory();
	}
	public static void createFolder() {
		System.out.println("Enter the path where you want to create a folder");
		try (Scanner scanner = new Scanner(System.in)) {
			String path=scanner.next();
			System.out.println("Enter the name of the directory");
			path=path+scanner.next();
			File file=new File(path);
			/*
			 * creating folder using mkdir()
			 */
			boolean bool=file.mkdir();
			if(bool) {
				System.out.println("Folder created successfully");
			}else {
				System.out.println("Folder alredy existed");
			}
			System.out.println(file.getAbsolutePath());
		}
	}
	public static void createFile() throws IOException {
		File newFile=new File("E:\\JavaDemo\\Employee.txt");
		if(newFile.createNewFile()) {
			System.out.println("New file created");
		}else {
			System.out.println("File already exists");
		}
	}
	public static void createDirectoryAndSubDirectory() {
		String directory="E:\\Dummy\\Person\\Name";
		File file=new File(directory);
		if(file.mkdirs()) {
			System.out.println("New directory and its subdirectories are created");
		}else {
			System.out.println("Directory is already existed");
		}
		System.out.println("getAbsolutePath : "+file.getAbsolutePath());
	}
}
