package collectionsconcept;
import java.util.*;
public class ConversionOfListToArray {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		Object[] arr=li.toArray();
		System.out.println(Arrays.toString(arr));
		
		
	}

}
