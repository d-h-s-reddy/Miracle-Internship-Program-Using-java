package setconcepts;
import java.util.*;
public class Hashsetconcept {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add("hari");
		hs.add("hari");
		hs.add(8.89);
		System.out.println(hs);
		hs.remove("hari");
		System.out.println(hs);
		System.out.println("Printing the hashset values using iterator");
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Printing the hashset values using Enhanced for loop");
		for(Object o:hs) {
			System.out.println(o);
		}
		HashSet hs2=new HashSet();
		hs2.add("hari");
		hs2.add(1);
		hs2.add("reddy");
		hs.retainAll(hs2);//it shows only common elements
		System.out.println(hs);
		hs.addAll(hs2);//it return the list of all elements
		System.out.println(hs);
		hs.removeAll(hs2);//it removes the comman elements
		System.out.println(hs);
		
	}

}
