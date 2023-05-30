package stringsconcept;
import java.util.*;
public class Findlength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		int count=0;
	    String str1="";
		while(true) {
			str1=str1+str.charAt(count);
	        if(str1.equals(str)) {
	        	break;
	        }
			count++;
		}
		System.out.println(count);
	}
}
