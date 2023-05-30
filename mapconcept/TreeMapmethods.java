package mapconcept;
import java.util.*;
public class TreeMapmethods {

	public static void main(String[] args) {
		TreeMap<Integer,Double> tm=new TreeMap();
		tm.put(1, 9.87);
		tm.put(0,8.9765);
		tm.put(5, null);
		System.out.println(tm.descendingMap());
		System.out.println("ceilingKey:"+tm.ceilingKey(3));
		System.out.println("first entry of the map:"+tm.firstEntry());
		System.out.println("key set are:"+tm.keySet());
		for(Map.Entry k:tm.entrySet()) {
			System.out.println(k.getKey()+" "+k.getValue());
		}
		System.out.println("Prining the values using iterator method");
		Set s=tm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
