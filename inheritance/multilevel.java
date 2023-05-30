package inheritance;
class Ani{
	void eat() {
		System.out.println("The Animal will eat");
	}
}
class D extends Ani{
	void bark() {
		System.out.println("The dog will bark");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("The baby dog will weep");
	}
}
public class multilevel {

	public static void main(String[] args) {
		BabyDog b=new BabyDog();
		b.weep();
		b.bark();
		b.eat();

	}

}
