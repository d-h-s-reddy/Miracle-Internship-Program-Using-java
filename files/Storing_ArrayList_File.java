package files;
import java.util.*;
import java.io.*;
public class Storing_ArrayList_File implements Serializable{

	public static void main(String[] args) throws Exception {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add("hari");
		a.add(8.90);
		FileOutputStream fi=new FileOutputStream("/home/training/Desktop/files/demo3.txt");
		ObjectOutputStream o=new ObjectOutputStream(fi);
		o.writeObject(a);
		o.close();
		fi.close();
		
		FileInputStream fs=new FileInputStream("/home/training/Desktop/files/demo3.txt");
		ObjectInputStream os=new ObjectInputStream(fs);
		System.out.println(os.readObject());
		os.close();
		fs.close();
	}
}
