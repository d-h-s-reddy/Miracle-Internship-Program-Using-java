package day1internship;
import java.util.*;
public class AvgOfThreeNum {
	int a;
	int b;
	int c;
	float avg;
	float average() {
		return (a+b+c)/3;
	}
	void display() {
		System.out.println("The average of the given numbers is:"+avg);
	}
	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            AvgOfThreeNum av=new AvgOfThreeNum();
            av.a=sc.nextInt();
            av.b=sc.nextInt();
            av.c=sc.nextInt();
            av.avg=av.average();
            av.display();
	}
}
