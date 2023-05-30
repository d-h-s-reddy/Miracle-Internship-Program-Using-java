package exceptionhandlings;
import java.util.*;
class Depoexc extends Exception{
	Depoexc(String s){
		super(s);
	}
}
class Wdraw extends Exception{
	Wdraw(String s){
		super(s);
	}
}
class InvalidNum extends Exception{
	InvalidNum(String s){
		super(s);
	}
}
class UserVerification extends Exception{
	UserVerification(String s){
		super(s);
	}
}
public class BankingProblem {
	static String usr="hari9244";
	static String pass="9244";
	static boolean verify(String user,String password) {
		if(user.equals(usr)) {
			if(password.equals(pass)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
		   return false; 
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount=10000;
		int choice;
		int depo;
		int wd;
		boolean val=true;
		while(val) {
			System.out.println(" 1)Deposit \n 2)Withdraw \n 3)Balance \n 4)Exit");
			choice=sc.nextInt();
				switch(choice) {
				case 1:{
					System.out.print("Enter the amount to deposit:");
					depo=sc.nextInt();
					if(depo>=500) {
						amount+=depo;
					}
					else {
						try {
							throw new Depoexc("The amount is less than 500");
						}
						catch(Depoexc D) {
							System.out.println(D);
						}
					}
					break;
				}
				case 2:{
					System.out.print("Enter the amount to withdraw:");
					wd=sc.nextInt();
					if(wd<=10000) {
						amount-=wd;
						System.out.println("The amount withdraw is :"+wd);
					}
					else {
						try {
							throw new Wdraw("insufficent funds");
						}
						catch(Wdraw w) {
							System.out.println(w);
						}
					}
					break;
				}
			   case 3:{
				   System.out.print("Enter the your user name:");
				   String user=sc.next();
				   System.out.print("Enter the password:");
				   String password=sc.next();
				   boolean condition=verify(user,password);
				   if(condition==true) {
				        System.out.println("The balance amount is:"+amount);
				   }
				   else {
					   try {
						   throw new UserVerification("Enter the correct credentials");
					   }
					   catch(Exception e) {
						   System.out.println(e);
					   }
				   }
				   break;
			   }
			   case 4:
				   val=false;
				   break;
			   default:{
				   try {
					   throw new InvalidNum("Enter the number between 1 and 4");
				   }
				   catch(Exception e) {
					   System.out.println(e);
				   }
			   }
			}
		}
	}
}
