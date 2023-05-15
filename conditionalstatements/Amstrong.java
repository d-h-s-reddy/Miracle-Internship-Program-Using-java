package conditionalstatements;
import java.util.*;
public class Amstrong {
	static int digitcount(int num) {
		int c=0;
		while(num>0) {
			num=num/10;
			c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int r;
		int count=0;
		count=digitcount(num);
		while(num>0) {
			r=num%10;
			sum+=(Math.pow(r, count));
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("The given number is an Amstring number");
		}
		else {
			System.out.println("The given number is not an Amstring number");

		}

	}

}
