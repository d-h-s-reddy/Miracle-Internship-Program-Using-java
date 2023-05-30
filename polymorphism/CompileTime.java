package polymorphism;
public class CompileTime {
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
    public static void main(String[] args) {
    	CompileTime t=new CompileTime();
    	System.out.println("The sum of two numbers is:"+t.add(10,20));
    	System.out.println("The sum of three numbers is:"+t.add(10,20,30));
    	System.out.println("The sum of two double numbers is:"+t.add(10.78, 20.90));


    }
}
