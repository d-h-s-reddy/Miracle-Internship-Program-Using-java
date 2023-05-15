package conditionalstatements;
import java.util.*;
public class CheckingUorLorDorS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character:");
		char c=sc.next().charAt(0);
		int a=c;
		System.out.println(a);
		if(a>=97 && a<=122) {
			System.out.println("The given character is a lower case letter");
		}
		else if(a>=65 && a<=90) {
			System.out.println("The given character is a Upper case letter");
		}
		else if(a>=48 && a<=57) {
			System.out.println("The given character is a number");
		}
		else {
			System.out.println("The given character is a special character");
		}
	}
}
