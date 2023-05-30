package exceptionhandlings;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());			
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print(e);
		}
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
