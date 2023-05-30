package collectionsconcept;
import java.util.*;
public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add("hari");
		ls.add("Sankar");
		ls.add(10);
		System.out.println(ls);
		ls.add(3,"reddy");
		ls.addFirst(14);
		ls.addLast("jntuv");
		System.out.println(ls);
		LinkedList ls1=new LinkedList();
		ls1.add("hari");
		System.out.println(ls1.contains("hari"));
		LinkedList ls2=new LinkedList();
		ls2=(LinkedList)ls1.clone();
		System.out.println(ls2);
		//iterator 
		Iterator i=ls.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//listIterator
		System.out.println("List itertor");
		ListIterator li=ls.listIterator();
		while(li.hasNext()) {
			li.next();
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		System.out.println("Enhanced for");
		for(Object o:ls) {
			System.out.println(o);
		}
		
		

		

	}

}
