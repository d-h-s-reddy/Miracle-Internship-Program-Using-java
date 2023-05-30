package files;
import java.io.*;
public class Creatingthefiles {

	public static void main(String[] args) throws Exception{
		File f=new File("/home/training/Documents/hari.txt");
		if(f.createNewFile()) {
			System.out.println("file is created");
		}
		else {
			System.out.println("not created");
		}
	}
}
