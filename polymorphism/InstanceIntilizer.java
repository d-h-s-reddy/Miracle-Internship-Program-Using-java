package polymorphism;

public class InstanceIntilizer {
    int a;
    InstanceIntilizer(){
    	System.out.println("This is the constructor block");
    	System.out.println(a);
    }
    {
    	System.out.println("This is the instance initilizer block");
    	a=10;
    }
	public static void main(String[] args) {
		InstanceIntilizer i=new InstanceIntilizer();

	}

}
