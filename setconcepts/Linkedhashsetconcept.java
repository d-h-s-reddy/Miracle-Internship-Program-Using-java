package setconcepts;
import java.util.*;
public class Linkedhashsetconcept {

	public static void main(String[] args) {
      LinkedHashSet<Integer> ls=new LinkedHashSet<>();
      ls.add(1);
      ls.add(2);
      ls.add(90);
      ls.add(89);
      System.out.println(ls);
      System.out.println("Printing the hashset values using iterator");
	  Iterator i=ls.iterator();
	  while(i.hasNext()) {
			System.out.println(i.next());
		}
	  System.out.println("Printing the LInkedHashSet using enhanced for loop");
	  for(int j:ls) {
		  System.out.println(j);
	  } 
	}
}
