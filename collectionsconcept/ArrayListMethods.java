package collectionsconcept;
import java.util.*;
public class ArrayListMethods {

	public static void main(String[] args) {
		List<Integer> li1=new ArrayList<Integer>();
		List<Integer> li2=new ArrayList<Integer>();
		li1.add(1);
		li1.add(2);
		li1.add(3);
		li1.add(3,90);
		li2.add(3);
		li2.add(4);
		li2.add(5);
    	li1.addAll(li2);
		System.out.println(li1);
		//retainAll
		li1.retainAll(li2);
		System.out.println(li1);
		//remove
		li1.remove(0);
		System.out.println(li1);
		//removeAll
		li1.removeAll(li2);
		System.out.println(li1);
		//clear
		li1.clear();
		System.out.println(li1);
		//set- it is only used for the integers 
		li2.set(1, 14);
		System.out.println(li2);
		
		//sort
		Collections.sort(li2);
		System.out.println(li2);
		
		//lastINdexOf
		System.out.println(li2.lastIndexOf(5));
		
		//replaceAll
		li2.replaceAll(e->e.MAX_VALUE);
		System.out.println(li2);
		

		
	}

}
