package polymorphism;
class Test{
	void add(int a,int b) {
		System.out.print("The sum of two numbers is:"+(a+b));
	}
}
class Test1{
	void add(int a,int  b) {
		System.out.print("The difference of two numbers is:"+(a-b));
	}
}
public class Runtimepolymorphism {
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.add(20, 10);
	}
}
