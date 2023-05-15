package conditionalstatements;
import java.util.*;
public class NumberOfDaysInaMonth {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the month:");
	   System.out.print("1)jan\n2)feb\n3)march\n4)april\n5)may\n6)june\n7)july\n8)aug\n9)sept\n10)oct\n11)nov\n12)dec");
	   int number=sc.nextInt();
	   if(number>=1 && number<=12) {
	   if(number==2) {
		   System.out.println("No of days in a month is:28");
	   }
	   //april august june september
	   else if(number==4 || number==6 || number==8 || number==9) {
		   System.out.println("No of days in a month is:30");
	   }
	   else {
		   System.out.println("No of days in a month is:31");
	   }
	   }
	   else {
		   System.out.println("Please enter the correct number");
	   }
   }
}
