package interfacesss;
interface A{
	void display();
}
interface B{
	void display();
}
class C implements A,B{
	public void display() {
		System.out.println("This is the child class");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		C c=new C();
		c.display();
	}

}
