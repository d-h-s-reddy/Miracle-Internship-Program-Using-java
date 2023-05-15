package constructors;
class DefaultConstructor{
	int a;
	String name;
}
class Parameterized{
	int a;
	String name;
	Parameterized(int b,String n){
		a=b;
		name=n;
		System.out.println("This is an parameterized constructor");
	}
}

public class DemoConstructor {
    //Creating an no-arg constructor
	int a;
	String name;
	DemoConstructor(){
		System.out.println("This the non-args constructor");
		a=10;
		name="Hari Sankar Reddy";
	}
	public static void main(String[] args) {
		DefaultConstructor d1=new DefaultConstructor();
		System.out.println(d1.a);
		System.out.println(d1.name+"\n\n");
		DemoConstructor d=new DemoConstructor();
		System.out.println(d.a);
		System.out.println(d.name+"\n\n");
		Parameterized h=new Parameterized(10,"Hari ");
		System.out.println(h.a);
		System.out.println(h.name);
		
		
	}
}
