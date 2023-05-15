package conditionalstatements;
import java.util.*;
public class Printingthesum2 {

	public static void main(String[] args) {
    // 1/1 + 1/2 + 1/22 + ..... + 1/2n
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the value of n: ");
	int n=sc.nextInt();
	double sum=1.0;
	for(int i=1;i<=n;i++) {
		sum+=(double)1/i*2;
	}
	System.out.println("The sum of the series is: "+sum);
	}

}
