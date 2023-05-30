package exceptionhandlings;

public class TeriminatingFinally {
     public static void main(String[] args) {
    	 try {
    		 System.out.println("hello");
    	 }
    	 catch(Exception e) {
    		 System.out.println("world");
    	 }
    	 finally {
    		 //status codes may be 0 or anynumber
    		 //0 means successfully terminated
    		 //anyothernumber is not successfully terminated
    		 System.exit(0);
    		 System.out.println("This is finally block");
    	 }
     }
}
