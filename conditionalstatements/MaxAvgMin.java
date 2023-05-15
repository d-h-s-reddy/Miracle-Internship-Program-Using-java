package conditionalstatements;
import java.util.*;
public class MaxAvgMin {
     double avg(int a[]) {
    	int sum=0;
    	for(int i=0;i<a.length;i++) {
    		sum+=a[i];
    	}
    	double average=(double)sum/10;
    	return average;
    }
     int max(int a[]) {
    	 int max=a[0];
    	 for(int i=1;i<a.length;i++) {
    		 if(a[i]>max) {
    			 max=a[i];
    		 }
    	 }
    	 return max;
     }
     int min(int a[]) {
    	 int min=a[0];
    	 for(int i=1;i<a.length;i++) {
    		 if(a[i]<min) {
    			 min=a[i];
    		 }
    	 }
    	 return min;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the 10 numbers:");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();	
		}
		MaxAvgMin mvm=new MaxAvgMin();
		System.out.println("The average of the 10 members is: "+mvm.avg(arr));
		System.out.println("The maximum number from the 10 members is: "+mvm.max(arr));
		System.out.println("The minimum number from the 10 members is: "+mvm.min(arr));
	}

}
