package conditionalstatements;
import java.util.*;
public class PrimeNumber {
	void generalapproach(int n) {
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println(n + " is a prime number");
		}
		else {
			System.out.println(n + " is not a prime number");
		}
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter a number:");
    	int num=sc.nextInt();
    	PrimeNumber p=new PrimeNumber();
    	p.generalapproach(num);
    }
}
