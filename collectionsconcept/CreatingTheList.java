package collectionsconcept;
import java.util.*;
public class CreatingTheList {

	public static void main(String[] args) {
		//generally we take the list interface and create all the class that implements it
		List li=new ArrayList();
		//now adding function
		li.add(10);
		li.add(2.67);
		li.add('c');
		li.add("hari sankar reddy");
		li.add(true);
		//for printing the list we have two ways
		System.out.println("by calling the object name dirctly"+li);
		for(int i=0;i<li.size();i++) 
		{
			System.out.println(li.get(i));
		}
		
		//list traversing using the iterator method
		Iterator i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Enhanced for loop for non-generic lists ");
		for(Object o:li) {
			System.out.println(o);
			
		}
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		//enhanced for loop
		for(int j:a) {
			System.out.println(j);
		}
	}
}
