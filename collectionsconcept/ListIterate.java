package collectionsconcept;
import java.util.*;
public class ListIterate {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("hari");
		al.add(9.876);
		al.add('h');
		ListIterator<Integer> l=al.listIterator();
		while(l.hasNext()) {
			l.next();
		}
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
	}

}
