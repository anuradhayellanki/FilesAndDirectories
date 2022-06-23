package com.cashapona.filesanddirectories.jun23;
import java.io.File;
import java.util.Scanner;
/**
 * @author Anuradha
 * read the content of the given text file using scanner class
 */
public class ReadFileUsingScannerClass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File file=new File("E:\\Employee.txt");
			Scanner scanner=new Scanner(file);
			while(scanner.hasNextLine()) {
				String string=scanner.nextLine();
				System.out.println(string);
			}
			scanner.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
