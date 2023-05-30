package exceptionhandlings;

public class TryCatchInFinally {

	public static void main(String[] args) {
		try {
			System.out.println("hello world");
		}
		finally {
			try {
				int c=9/0;
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
