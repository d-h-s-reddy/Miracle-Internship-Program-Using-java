package day1internship;
import java.util.*;
public class Rectangle {
	float length;
	float breadth;
	float returnArea() {
		return length*breadth;
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	Rectangle r=new Rectangle();
    	r.length=sc.nextFloat();
    	r.breadth=sc.nextFloat();
    	System.out.println("The area of the rectangle is: "+r.returnArea());
    	
    	
    	
    }
}
