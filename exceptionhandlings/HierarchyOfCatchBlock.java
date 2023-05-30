package exceptionhandlings;

public class HierarchyOfCatchBlock {

	public static void main(String[] args) {
		try {
			try {
			String s=null;
			System.out.println(s.length());
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		catch(NullPointerException e) {
			System.out.print(e);
		}

	}

}
