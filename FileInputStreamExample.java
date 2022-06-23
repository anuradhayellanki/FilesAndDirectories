package com.cashapona.filesanddirectories.jun22;
import java.io.FileInputStream;
/**
 * @author Anuradha
 */
public class FileInputStreamExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		readSingleCharacter();
		readAllCharacters();
	}
	/*
	 * read single character from the file abc.txt
	 */
	public static void readSingleCharacter() {
		try {
			FileInputStream fileInput=new FileInputStream("E:\\BasicTraining\\abc.txt");
			int i=fileInput.read();
			System.out.println("Read single character from file : "+(char)i);
			fileInput.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	/*
	 * read all characters from the file abc.txt
	 */
	public static void readAllCharacters() {
		try {
			FileInputStream fileInputAll=new FileInputStream("E:\\BasicTraining\\abc.txt");
			int i;
			System.out.print("Read all characters from file : ");
			System.out.println();
			while((i=fileInputAll.read())!=-1) {
				System.out.print((char)i+"");
			}
			fileInputAll.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
