package files;
import java.io.*;
public class Fop {

	public static void main(String[] args) throws Exception{
		FileOutputStream fo=new FileOutputStream("/home/training/Desktop/files/demo.txt");
		fo.write(65);
		fo.close();
		FileInputStream fi=new FileInputStream("/home/training/Desktop/files/demo.txt");
		int s=fi.read();
		System.out.println((char)s);
	}

}
