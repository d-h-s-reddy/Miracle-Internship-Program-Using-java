package conditionalstatements;
import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the number:");
    	int num=sc.nextInt();
    	if(num>0) {
    		System.out.println(num + " is a positive number");
    	}
    	else if(num==0) {
    		System.out.println("The number is either positive or negative");
    	}
    	else {
    		System.out.println(num + " is a negative number");
    	}
    }
}
