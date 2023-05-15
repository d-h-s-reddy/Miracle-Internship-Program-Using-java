package day1;
public class WithArguments {
	int add(int a ,int b) {
		return a+b;
	}
	float mul(float a,float b) {
		return a*b;
	}
	double sub(double a,double b) {
		return a-b;
	}
	String name(String s) {
		return s;
	}
	char cr(char a) {
		return a;
	}
	boolean torf(boolean n) {
		return true;
	}
	void n(String name) {
		System.out.println("name of the college is:"+name);
	}
     public static void main(String[] args) {
    	 WithArguments w=new WithArguments();
    	 System.out.println("The sum of the two integers is:"+w.add(10, 20));
    	 System.out.println("The product of the two floating point values is:"+w.mul(10.25f, 20.90f));
    	 System.out.println("The subtraction of the two double values is:"+w.sub(10.25, 20.90));
    	 System.out.println("The name of the student is:"+w.name("Hari Sankar Reddy"));
    	 System.out.println("The first character of the name is:"+w.cr('H'));
    	 System.out.println("The boolean value of the given is:"+w.torf(true));
    	 w.n("JNTU-GV");
     }
}
