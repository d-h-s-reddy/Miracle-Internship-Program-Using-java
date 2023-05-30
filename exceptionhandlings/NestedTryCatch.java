package exceptionhandlings;

public class NestedTryCatch {

	public static void main(String[] args) {
		 int[] arr=new int[3];
	     try {
	    	 try {
	    		 arr[3]=0;
	    	 }
	    	 catch(ArrayIndexOutOfBoundsException e) {
	    		 System.out.println(e);
	    	 }
	    	 int c=9/0;
	     }
	     catch(Exception e) {
	    	 System.out.println(e);
	     }
	}
}
