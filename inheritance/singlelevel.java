package inheritance;
class Animal{
	void eat() {
		System.out.println("The Animal will eat");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("The dog will bark");
	}
}
public class singlelevel {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();

	}

}
