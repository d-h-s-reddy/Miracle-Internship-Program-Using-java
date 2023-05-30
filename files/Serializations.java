package files;
import java.io.*;
class Student implements Serializable{
	int id;
	String name;
	Student(int id , String name){
		this.id=id;
		this.name=name;
	}
}
public class Serializations{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fo=new FileOutputStream("/home/training/Desktop/files/demo1.txt");
		Student s1=new Student(14,"hari");
		Student s2=new Student(15,"sankar");
		ObjectOutputStream out=new ObjectOutputStream(fo);
		out.writeObject(s1);
		out.writeObject(s2);
		out.close();
		fo.close();
		
		FileInputStream fi=new FileInputStream("/home/training/Desktop/files/demo1.txt");
		ObjectInputStream ois=new ObjectInputStream(fi);
		while(fi.available()!=0){
		 Student s3=(Student)ois.readObject();
		 System.out.println(s3.id+" "+s3.name);
		}
		fi.close();
	}
}
