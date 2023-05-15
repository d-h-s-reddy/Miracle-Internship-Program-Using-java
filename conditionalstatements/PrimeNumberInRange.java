package conditionalstatements;
import java.util.*;
public class PrimeNumberInRange {
	void primerange(int s,int e) {
		for(int i=s;i<=e;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the starting number:");
    	int start=sc.nextInt();
    	System.out.print("Enter the ending number:");
    	int end=sc.nextInt();
    	PrimeNumberInRange p=new PrimeNumberInRange();
    	p.primerange(start,end);
    }
}
