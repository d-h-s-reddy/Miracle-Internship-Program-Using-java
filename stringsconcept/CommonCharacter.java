package stringsconcept;
import java.util.*;
public class CommonCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String str="";
		long startTime = System.currentTimeMillis();  
		for(int i=0;i<str1.length();i++) {
            if(!(str.contains(str1.charAt(i)+""))) {
			     for(int j=0;j<str2.length();j++) {
		             if(!(str.contains(str2.charAt(i)+""))) {
				      if(str1.charAt(i)==str2.charAt(j)) {
					       str=str+str1.charAt(i);
					       System.out.println("The common characters is :"+str1.charAt(i));
				       }
		             }
			    }
            }
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
