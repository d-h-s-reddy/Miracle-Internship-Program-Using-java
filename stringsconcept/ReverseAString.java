package stringsconcept;
import java.util.*;
public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String strreverse="";
		for(int i=str.length()-1;i>=0;i--) {
			strreverse+=str.charAt(i);
		}
		System.out.println("The reverse string is:"+strreverse);

	}

}
