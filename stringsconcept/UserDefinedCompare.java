package stringsconcept;
import java.util.*;
public class UserDefinedCompare {
    static void compares(String str1,String str2) {
    	int flag=0;
    	if(str1.length()==str2.length()) {
    		for(int i=0;i<str1.length();i++) {
    			if(str1.charAt(i)!=str2.charAt(i)) {
    				flag=1;
    				break;
    			}
    		}
    	}
    	else {
    		flag=1;
    	}
    	if(flag==0) {
    		System.out.println("The strings are same");
    	}
    	else {
    		System.out.println("The strings are not same");
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		compares(str1,str2);
	}

}
