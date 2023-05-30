package files;
import java.io.*;
class Students{
	int id;
	String name;
//	Students(int id , String name){
//		this.id=id;
//		this.name=name;
//	}
}
public class Deserialize {

	public static void main(String[] args) throws Exception {
		FileInputStream fi=new FileInputStream("/home/training/Desktop/files/demo1.txt");
		ObjectInputStream ois=new ObjectInputStream(fi);
		while(fi.available()!=0) {
		Students s1=(Students)ois.readObject();
		System.out.println(s1.id+" "+s1.name);
		}
		fi.close();
		ois.close();
		

	}

}
