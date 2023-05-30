package files;
import java.util.*;
import java.io.*;
public class Storing_Treeset_values implements Serializable{

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		TreeSet ts=new TreeSet();
		ts.add(1);
		ts.add(2);
		ts.add(2);
		ts.add(4);
		ts.add(3);
		System.out.println(ts);
		FileOutputStream fi=new FileOutputStream("/home/training/Desktop/files/demo5.txt");
		ObjectOutputStream o=new ObjectOutputStream(fi);
		o.writeObject(ts);
		
		FileInputStream fs=new FileInputStream("/home/training/Desktop/files/demo5.txt");
		ObjectInputStream os=new ObjectInputStream(fs);
		TreeSet t=(TreeSet)os.readObject();
		System.out.println(t);
		
	}

}
