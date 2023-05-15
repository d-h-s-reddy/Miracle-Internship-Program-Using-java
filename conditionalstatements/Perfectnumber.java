package conditionalstatements;
import java.util.*;
public class Perfectnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of num:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			System.out.println("The given number is a perfect number");
		}
		else {
			System.out.println("The given number "+num+" is not a perfect number");
		}
	}

}
