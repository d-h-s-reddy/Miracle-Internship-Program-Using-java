package day1;

public class Constructors {
	//the constructors are mainly used to inytilize the object it is used to allocate the memory to the objects
	//There are two types of constructors
	/* default constructor
	 * parameterized constructor-In this we pass the parameters in the constructor  
	 */
    Constructors(int a){
    	System.out.println("hello world");
    	//let us do an small pattern
    	for(a=1;a<=4;a++) {
    		for(int k=a;k>=1;k--) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	
    }
	public static void main(String[] args) {
		Constructors c=new Constructors(4);
	}

}
