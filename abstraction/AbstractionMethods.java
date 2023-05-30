package abstraction;
abstract class D{
	void dis() {
		System.out.println("Hello world");
	}
	
}
public class AbstractionMethods extends D {

	public static void main(String[] args) {
		D d=new AbstractionMethods();
		d.dis();

	}

}
