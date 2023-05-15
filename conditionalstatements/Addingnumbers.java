package conditionalstatements;
import java.util.*;
public class Addingnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of digits to be added:");
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			System.out.print("Enter the number:");
			int num=sc.nextInt();
			sum+=num;
			n--;
		}
		System.out.println("The sum of given "+n+"digits is:"+sum);

	}

}
