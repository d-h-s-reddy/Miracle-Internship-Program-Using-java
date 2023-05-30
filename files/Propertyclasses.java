package files;
import java.io.*;
import java.util.*;
import java.util.*;
public class Propertyclasses {

	public static void main(String[] args) throws Exception{
		FileOutputStream fo=new FileOutputStream("/home/training/Desktop/files/demo2.properties");
		Properties p=new Properties();
		p.setProperty("1", "hari");
		p.setProperty("2", "sankar");
		p.store(fo, "This is a properties classes");
		fo.close();
		
		FileInputStream fi=new FileInputStream("/home/training/Desktop/files/demo2.properties");
		Properties p1=new Properties();
		p1.load(fi);
		String a=p1.getProperty("1");
		String b=p1.getProperty("2");
		System.out.println(a+" "+b);
		
		//iteration using iterable class
		Set s=p.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//using enhanced for loop
		for(Map.Entry m:p.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
