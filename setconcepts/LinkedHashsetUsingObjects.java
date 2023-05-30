package setconcepts;
import java.util.*;
class Book{
	String bname;
	String publishedDate;
	int price;
	Book(String bname,String publishedDate,int price){
		this.bname=bname;
		this.publishedDate=publishedDate;
		this.price=price;
	}
}
public class LinkedHashsetUsingObjects {

	public static void main(String[] args) {
		LinkedHashSet<Book> ls=new LinkedHashSet<>();
		Book b1=new Book("Let us c","Yashavant Kanetkar",600);
		Book b2=new Book("Basic Of Machine Learning","Yashavant Kanetkar",1000);
		ls.add(b1);
		ls.add(b2);
		System.out.println("Using iterator() method for printing the variables inside the book class ");
		Iterator i=ls.iterator();
		while(i.hasNext()) {
			Book b=(Book)i.next();
			System.out.println(b.bname+" "+b.publishedDate+" "+b.price);
		}
        System.out.println("Using the enhanced for loop");
        for(Book s:ls) {
        	System.out.println(s.bname);
        }

	}

}
