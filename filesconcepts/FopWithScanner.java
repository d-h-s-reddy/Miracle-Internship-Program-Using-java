package filesconcepts;
import java.util.*;
import java.io.*;
public class FopWithScanner {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fo=new FileInputStream("C:\\Users\\My PC\\OneDrive\\Desktop\\examples\\dem.txt");
		Scanner sc=new Scanner(fo,"UTF-8");
		while(sc.hasNext()) {
			String val=sc.nextLine();
			System.out.println(val);
		}
	}
}
