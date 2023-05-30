package stringsconcept;
import java.util.*;
public class ReplaceFirstCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str=str.trim();
		str=str.replace(str.charAt(0)+"",str.charAt(str.length()-1)+"");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				str=str.replace(str.charAt(i+1)+"", str.charAt(i-1)+"");
			}	
		}
		System.out.println(str);

	}

}
