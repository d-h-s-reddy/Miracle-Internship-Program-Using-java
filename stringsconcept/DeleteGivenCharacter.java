package stringsconcept;
import java.util.*;
public class DeleteGivenCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string");
		String str=sc.next();
		System.out.print("Enter the character that is need to be deleted:");
		char c=sc.next().charAt(0);
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				continue;
			}
			else {
				str1=str1+str.charAt(i);
			}
		}
		System.out.println("The new string is:"+str1);
		

	}

}
