package conditionalstatements;
import java.util.*;
public class EvenOrOddInRange {
	void EvenOrOdd(int s,int e) {
		int count=0;
		for(int i=s;i<=e;i++) {
			if(i%2==0) {
				count++;
//				System.out.println(i + " is a even number");
			}
			else {
				System.out.println(i + " is a odd number");
			}
		}
		System.out.println("No of even number in the range 1 to n are:"+count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting number: ");
		int start=sc.nextInt();
		System.out.print("Enter the last number: ");
		int end=sc.nextInt();
		EvenOrOddInRange e=new EvenOrOddInRange();
		e.EvenOrOdd(start,end);

	}

}
