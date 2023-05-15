package conditionalstatements;
import java.util.*;
public class ConvertHourstoSeconds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the time in hours:");
		int t=sc.nextInt();
		System.out.print("The time in seconds is:"+(t*3600));
        
	}

}
