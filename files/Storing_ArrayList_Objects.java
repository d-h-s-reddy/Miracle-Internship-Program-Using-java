package files;
import java.util.*;
import java.io.*;
class Stu implements Serializable{
	int id;
	String name;
	Stu(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class Storing_ArrayList_Objects {

	public static void main(String[] args) throws Exception{
		Stu s1=new Stu(14,"hari");
		Stu s2=new Stu(60,"mukund");
		ArrayList<Stu> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		FileOutputStream fi=new FileOutputStream("/home/training/Desktop/files/demo4.txt");
		ObjectOutputStream o=new ObjectOutputStream(fi);
		o.writeObject(al);
		
		//getting the inputs back
		FileInputStream fs=new FileInputStream("/home/training/Desktop/files/demo4.txt");
		ObjectInputStream os=new ObjectInputStream(fs);
		ArrayList<Stu> a=(ArrayList)os.readObject();
		Iterator i=a.iterator();
		while(i.hasNext()) {
			Stu s=(Stu)i.next();
			System.out.println(s.id+" "+s.name);
		}
		System.out.println();
		for(Stu ss:a) {
			System.out.println(ss.id+" "+ss.name);
		}
	}
}
