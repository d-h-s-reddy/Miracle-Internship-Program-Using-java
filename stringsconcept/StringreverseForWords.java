package stringsconcept;
import java.util.*;
public class StringreverseForWords {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine();
    	s=s.trim();
    	String[] words=s.split(" ");
    	for(String w:words) {
    		String str=w;
    		for(int i=str.length()-1;i>=0;i--) {
    			System.out.print(str.charAt(i));
    		}
    		System.out.print(" ");
    	}
    	
    }
}
