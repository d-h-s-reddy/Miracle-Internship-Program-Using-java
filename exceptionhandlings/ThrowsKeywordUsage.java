package exceptionhandlings;

public class ThrowsKeywordUsage {
	public void show()throws ArithmeticException{
		System.out.println(9/0);
	}
    public static void main(String[] args) {
    	ThrowsKeywordUsage t=new ThrowsKeywordUsage();
    	try {
    	t.show();
    	}
    	catch(Exception e) {
    		System.out.println("This is the try catch exception for throws");
    	}
    }
}
