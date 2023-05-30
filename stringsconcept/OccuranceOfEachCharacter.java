package stringsconcept;
import java.util.*;
public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			count=0;
			if(!(s1.contains(s.charAt(i)+""))) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					s1+=s.charAt(i);
					count++;
				}
			}
			System.out.println("The occurence of: "+s.charAt(i)+" is:"+count);
			}
		}
	}

}
