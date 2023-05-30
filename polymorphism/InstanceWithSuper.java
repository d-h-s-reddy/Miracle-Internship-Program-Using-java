package polymorphism;
class A{
	A(){
		System.out.println("This is the super class");
	}
	{
		System.out.println("This is the instance intilizer in parent class block");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("This is the child class");
	}
	{
		System.out.println("This is the instance intilizer in child class block");
	}
	
}
public class InstanceWithSuper {

	public static void main(String[] args) {
		B b=new B();

	}

}
