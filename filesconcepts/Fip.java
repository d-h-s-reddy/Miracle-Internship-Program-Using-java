package filesconcepts;
import java.io.*;
public class Fip {

	public static void main(String[] args) throws Exception{
		File fp=new File("C:\\Users\\My PC\\OneDrive\\Desktop\\examples\\dem.txt");
		FileInputStream fi=new FileInputStream(fp);
		int i=0;
//		while((i=fi.read())!=-1) {
//			System.out.print((char)i);
//		}
//		
		byte[] b=new byte[1024];
		fi.read(b);
		for(i=0;i<b.length;i++) {
			System.out.print((char)b[i]);
		}
		
		fi.close();
	}
}
