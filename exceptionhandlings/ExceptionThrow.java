package exceptionhandlings;

class GeneralException extends Exception {
	int a=10;
    int b=20;
	public GeneralException(String s) {
		super(s);
	}
}
public class ExceptionThrow {

	public static void main(String[] args)  {
		//Generally the  throw is mainly used to throw the exception to the catch block
		int a=10;
		int b=0;
		try {
			int c=a/10;
//			if(b==0) {
//				throw new ArithmeticException("The throw exception");
//			}
			if(a==10) {
				throw new GeneralException("I am done with this throw keyword");
				//the arguments passed through the throw keyword is passed to the constructor that is written
				//inside the user exception that is created by us
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		} catch (GeneralException e) {
			System.out.println("hello i am done with this"+e);
		}

	}

}
