package mapconcept;
import java.util.*;
public class Hashmapmethods {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		Map<Integer,String> m2=new HashMap();
        m2.put(4, "d");
        m2.put(6, "l");
        m2.put(5, "e");
        m.putAll(m2);//same as addAll() 
        m.remove(1);
        m.remove(2,"b");
        System.out.println(m.keySet());//print the key values
        System.out.println(m.containsKey(4));
        System.out.println(m.containsValue("a"));
        
        //replace method
        m.replace(3, "k");
        m.replace(4,"d","j");
        m.replaceAll((k,v)->"hari");
        
		//for traversing we need to convert the map into set using the entrset() method
		Set s=m.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m1=(Map.Entry)i.next();
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
		//by using the enhanced for loop
		for(Map.Entry m1:m.entrySet()) {
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
	}
}
