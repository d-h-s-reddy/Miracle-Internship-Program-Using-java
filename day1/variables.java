package day1;

public class variables {
    static int b=12;
    static String branchname;
    String collegename;
	void hello() {
		int a=10;
		System.out.println(a);
		System.out.println(b);
	}
	void dis() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		variables v=new variables();
		v.hello();
		v.b=14;
		variables v1=new variables();
		v1.b=16;
		System.out.println(v.b);
		variables v2=new variables();
		v2.b=20;
		System.out.println(v.b);
		System.out.println(v1.b);
		v.collegename="jntugv";
		v1.collegename="miracle";
		System.out.println(v.collegename);
		System.out.println(v1.collegename);
	}
}
