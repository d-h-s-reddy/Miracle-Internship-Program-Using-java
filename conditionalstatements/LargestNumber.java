package conditionalstatements;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the first number:");
    	int num1=sc.nextInt();
    	System.out.println("Enter the second number:");
    	int num2=sc.nextInt();
    	if(num1>num2) {
    		System.out.println("The "+num1+" is greater than the "+num2);
    	}
    	else {
    		System.out.println("The "+num2+" is greater than the "+num1);
    	}
    }
}
