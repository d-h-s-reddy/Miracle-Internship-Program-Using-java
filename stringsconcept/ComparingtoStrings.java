package stringsconcept;

public class ComparingtoStrings {

	public static void main(String[] args) {
		/* The strings can be compared in three ways
		 * 1)equals()-it compares the actual content
		 * 2)== it compares the reference of the strings
		 * 3)compareTo() it will return the integer value it check lexicographical values*/
		String s1="Hello";
		String s2="hello";
		System.out.println(s1.equals(s2));
		System.out.print(s1.equalsIgnoreCase(s2));
		String s3=s1.concat(s2);
		System.out.println("The new String is:"+s3);
		System.out.println("The new String is:"+s3.substring(2));
		System.out.println("The new String is:"+s3.substring(2,8));
		String[] a=new String[10];
		a[0]="j";
		a[1]="l";
		
		System.out.println("The new String is:"+a[0]);
	}

}
