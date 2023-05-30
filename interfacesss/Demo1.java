package interfacesss;

interface Animal{
	int n=10;
	void eat();
}
class Dog implements Animal{
	public void eat() {
		System.out.println("Dog can eat");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		System.out.print(d.n);

	}

}
