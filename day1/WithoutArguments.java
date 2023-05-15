package day1;

public class WithoutArguments {
	int add() {
		return 10+20;
	}
	float mul() {
		return 10.23f*20.89f;
	}
	double sub() {
		return 10.20-20.89;
	}
	String name() {
		return "Hari Sankar Reddy";
	}
	char firstchar() {
		return 'H';
	}
	boolean torf() {
		return true;
	}
	void greetingmsg() {
		System.out.println("Hi Welcome to Internship program");
	}
	public static void main(String[] args) {
		WithoutArguments wi=new WithoutArguments();
		wi.greetingmsg();
		int c=wi.add();
		System.out.println("THe sum of two members is:"+wi.add());
		System.out.println("The mul of two floating point values are:"+wi.mul());
		System.out.println("The subtraction of the two double values are:"+wi.sub());
		System.out.println("The name of the student is:"+wi.name());
		System.out.println("The first character of the string is:"+wi.firstchar());
		System.out.println("The boolean value is:"+wi.torf());
	}
}
