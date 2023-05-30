package setconcepts;
import java.util.*;
public class Treesetconcept {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("hari");
		ts.add("sankar");
		ts.add("reddy");
		ts.add("a");
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println(ts.headSet("reddy", true));
		System.out.println(ts.subSet("hari", true,"sankar",false));
		System.out.println(ts.tailSet("reddy", true));
		Iterator i=ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(String s:ts) {
			System.out.println(s);
		}

	}

}
