package conditionalstatements;
import java.util.*;
public class PassOrFail {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the marks obtained: ");
	   int avg=sc.nextInt();
	   if(avg>49) {
		   if(avg>90 && avg<=100) {
			   System.out.println("The grade for the student is: A");
		   }
		   else if(avg>80 && avg<=90) {
			   System.out.println("The grade for the student is: B");
		   }
		   else if(avg>70 && avg<=80) {
			   System.out.println("The grade for the student is: C");
		   }
		   else if(avg>60 && avg<=70) {
			   System.out.println("The grade for the student is: D");
		   }
		   else {
			   System.out.println("The grade for the student is: E");
		   }
	   }
	   else {
		   System.out.println("The student is Fail: F");
	   }
   }
}
