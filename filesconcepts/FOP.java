package filesconcepts;
import java.io.*;
public class FOP {

	public static void main(String[] args) throws IOException {
		File fp=new File("C:\\Users\\My PC\\OneDrive\\Desktop\\examples\\dem.txt");
		FileOutputStream fs=new FileOutputStream(fp);
		String s="hello world\n";
		String s1="this is the file programs";
		byte[] b=s.getBytes();
		byte[] bs=s1.getBytes();
		fs.write(b);
		fs.write(bs);
		fs.close();
	}
}
