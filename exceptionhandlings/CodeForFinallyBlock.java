package exceptionhandlings;

public class CodeForFinallyBlock {

	public static void main(String[] args) {
		try {
			int c=9/0;
		}
		catch(Exception e) {
			System.out.print(e);
		}
		finally {
			System.out.println("execting of finally block");
		}
	}
}
