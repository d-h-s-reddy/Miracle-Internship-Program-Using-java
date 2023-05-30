package filesconcepts;
import java.io.*;
public class CreatingTheFile {

	public static void main(String[] args) throws IOException {
         File fp=new File("C:\\Users\\My PC\\OneDrive\\Desktop\\examples\\demo1.txt");
         if(fp.createNewFile()) {
        	 System.out.println("New file is created");
         }
         else {
        	 System.out.println("The file is not created");
         }
	}

}
