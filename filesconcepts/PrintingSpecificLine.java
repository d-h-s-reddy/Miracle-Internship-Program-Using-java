package filesconcepts;
import java.util.*;
import java.io.*;
public class PrintingSpecificLine {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\My PC\\OneDrive\\Desktop\\examples\\demo3.txt");
		FileInputStream fp=new FileInputStream(f);
		System.out.print("Enter the line number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Scanner scs=new Scanner(fp,"UTF-8");
		int count=0;
		while(scs.hasNext()) {
			count++;
			String s=scs.nextLine();
			if(num==count) {
				System.out.print(s);
				break;
			}
		}
	}

}
