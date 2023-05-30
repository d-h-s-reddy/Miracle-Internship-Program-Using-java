package exceptionhandlings;

public class AllExceptions {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int[] arr=new int[5];
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		try {
			String str="hello";
			System.out.println(str.charAt(str.length()));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		try {
			String s1="abc";
			int i=Integer.parseInt(s1);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	}

}

