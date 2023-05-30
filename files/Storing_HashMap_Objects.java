package files;
import java.util.*;
import java.io.*;
class Book{
	int bid;
	String name;
	int cost;
	Book(int bid,String name,int cost){
		this.bid=bid;
		this.name=name;
		this.cost=cost;
	}
}
public class Storing_HashMap_Objects implements Serializable{
	
	public static void main(String[] args) throws Exception {
		HashMap<Integer,Book> b=new HashMap<>();
		Book b1=new Book(14,"Hari",800);
		Book b2=new Book(15,"Sankar",1000);
		b.put(1,b1);
		b.put(2,b2);
		
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("/home/training/Desktop/files/demo6.txt"));
		out.writeObject(b);
		
		ObjectInputStream os=new ObjectInputStream(new FileInputStream("/home/training/Desktop/files/demo6.txt"));
		HashMap<Integer,String> bs=(HashMap)os.readObject();
		
	}

}
