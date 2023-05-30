package abstraction;
abstract class demo1{
	abstract void display();
}
class demo2 extends demo1{
	void display() {
		System.out.println("hello world");
	}
}
public class demo {
   public static void main(String[] args) {
	   demo1 d=new demo2();
	   d.display();
   }
}
