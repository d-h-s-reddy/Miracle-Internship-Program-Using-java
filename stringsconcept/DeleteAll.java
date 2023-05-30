package stringsconcept;
import java.util.*;
public class DeleteAll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String st1=str1;
		String st2=str2;
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					st1=st1.replace(str1.charAt(i)+"","");
					st2=st2.replace(str1.charAt(i)+"","");

				}
			}
		}
		System.out.println(st1);
		System.out.println(st2);
	}
}
