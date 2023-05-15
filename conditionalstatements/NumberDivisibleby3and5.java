package conditionalstatements;
import java.util.*;
public class NumberDivisibleby3and5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num%3==0) {
			if(num%5==0) {
				System.out.println(num + " The number is divisible by both 3 and 5");
			}
			else {
				System.out.println(num + " The number is divisible by 3 but not with 5");
			}
		}else {
			if(num%5==0) {
				System.out.println(num + " The number is not divisible by 3 but divisible with 5");

			}else {
				System.out.println(num + " The number is not divisible by both 3 and 5");
			}
		}
	}

}
