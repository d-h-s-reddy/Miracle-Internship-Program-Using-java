package stringsconcept;
import java.util.*;
public class FindingVowlesAndConstants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=s.toLowerCase();
		int v=0,c=0;
		for(int i=0;i<s.length();i++) {
			if('0'<=s.charAt(i) && s.charAt(i)<='9') {
				System.out.println("The character is the number:"+s.charAt(i));
			}
			else {
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
					System.out.println("The character is a vowels:"+s.charAt(i));
					v++;
				}
				else {
					c++;
				}
			}
		}
		System.out.println("No of vowles are:"+v);
		System.out.println("No of constants are:"+c);
	}

}
