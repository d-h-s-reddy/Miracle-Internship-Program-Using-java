package stringsconcept;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder sb=new StringBuilder(str);
	    sb.reverse();
	    int flag=0;
	    for(int i=0;i<str.length();i++) {
	    	if(str.charAt(i)!=sb.charAt(i)) {
	    		flag=1;
	    		break;
	    	}
	    }
	    if(flag==0) {
	    	System.out.println("The given string is a palindrome");
	    }
	    else {
	    	System.out.println("No a palindrome");
	    }
		
		

	}

}
