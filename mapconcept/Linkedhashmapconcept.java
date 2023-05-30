package mapconcept;
import java.util.*;
public class Linkedhashmapconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedHashMap<Integer,String> lm=new LinkedHashMap();
      lm.put(2,"reddy");
      lm.put(1, "sankar");
      for(Map.Entry m1:lm.entrySet()) {
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
	}

}
