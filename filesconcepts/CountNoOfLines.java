package filesconcepts;

import java.io.*;
import java.util.Scanner;

public class CountNoOfLines {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("C:\\Users\\My PC\\OneDrive\\Desktop\\examples\\demo3.txt");
		FileInputStream fp=new FileInputStream(f);
		Scanner sc=new Scanner(fp,"UTF-8");
		int count=0;
		while(sc.hasNext()) {
			sc.nextLine();
			count++;
		}
		System.out.println("No of lines in the file are:"+count);

	}

}
