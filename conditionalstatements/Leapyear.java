package conditionalstatements;
import java.util.*;
public class Leapyear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year");
		int year=sc.nextInt();
		if(year%4==0) {
			if(year % 100 !=0) {
					System.out.println(year +" is a leap year");
			}
			else {
				if(year % 400 ==0) {
					System.out.println(year + "is a leap year");
				}
			    else {
				System.out.println(year + "is a leap year");
			    }
		   }
		}
		else {
			System.out.println(year + "not a leap year");
		}
	}
}
