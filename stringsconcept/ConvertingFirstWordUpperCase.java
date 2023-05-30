package stringsconcept;
import java.util.*;
public class ConvertingFirstWordUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.trim();
		str=str.substring(0,1).toUpperCase()+str.substring(1);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				str=str.substring(0,i+1)+str.substring(i+1,i+2).toUpperCase()+str.substring(i+2);
			}
		}
		System.out.println(str);	
		
		
		
		//or we can also done by using the split() method
		String[] words=str.split(" ");
		for(String w:words) {
			String s1=w;
			s1=s1.substring(0,1).toUpperCase()+s1.substring(1)+" ";
			System.out.print(s1);
		}
		
		
	}
}
