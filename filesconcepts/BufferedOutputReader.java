package filesconcepts;
import java.io.*;
public class BufferedOutputReader {

	public static void main(String[] args) throws IOException {
		FileOutputStream fp=new FileOutputStream("C:\\Users\\My PC\\OneDrive\\Desktop\\examples\\demo2.txt");
		BufferedOutputStream b=new BufferedOutputStream(fp);
		String s="hari sankar reddy";
		byte[] bs=s.getBytes();
		b.write(bs);
		b.flush();
		fp.close();
	}
}
