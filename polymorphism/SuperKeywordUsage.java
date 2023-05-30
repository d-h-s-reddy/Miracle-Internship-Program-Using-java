package polymorphism;
class Animal{
	String c="green";
}
class D extends Animal{
	void dis() {
	   System.out.println("The color of the super class is:"+super.c);
	}
}

public class SuperKeywordUsage {
     public static void main(String[] args) {
    	 D d=new D();
    	 d.dis();
     }
}
