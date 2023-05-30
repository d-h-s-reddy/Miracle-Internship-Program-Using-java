package stringsconcept;
import java.util.*;
public class NoOfWordsAndCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.nextLine();
		int noofwords=1;
		int noofcharacters=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				noofwords++;
			}
			else {
				noofcharacters++;
			}
		}
		System.out.println("Total no of words are:"+noofwords);
		System.out.println("Total no of characters are:"+noofcharacters);

		
	}

}
