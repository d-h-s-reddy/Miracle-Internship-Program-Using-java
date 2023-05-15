package conditionalstatements;
import java.util.*;
public class SwitchcaseCalculator {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter your choice:\n1)sum\n2)sub\n3)mult\n4)Div\n5)modulo:");
    	int choice=sc.nextInt();
    	int a=10;
    	int b=20;
    	switch(choice) {
    	case 1:
    		System.out.println(a+b);
    		break;
    	case 2:
    		System.out.println(a-b);
    		break;
    	case 3:
    		System.out.println(a*b);
    		break;
    	case 4:
    		System.out.println(b/a);
    		break;
    	case 5:
    		System.out.println(b%a);
    		break;
    	default:
    		System.out.println("please enter the correct number");
    	}
    }
}
