package conditionalstatements;
import java.util.*;
public class MaxAvgMinanothermethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int max=0;
		int min=0;
		for(int i=1;i<=10;i++) {
			int a=sc.nextInt();
			sum+=a;
			if(a>max) {
				max=a;
			}
			if(i==1) {
				min=a;
			}
			if(a<min) {
				min=a;
			}
		}
		System.out.println("The average of the 10 members is:"+(double)sum/10);
		System.out.println("The maximum number in the 10 members is:"+max);
		System.out.println("The minimum number in the 10 members is:"+min);

	}

}
