package conditionalstatements;
public class TablesUpto12 {
    static void tables(int n) {
    	for(int i=1;i<=12;i++) {
    		System.out.println(i+"*"+n+"="+(i*n));
    	}
    }
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("\nThe multiplication table for :"+i);
			tables(i);
		}

	}

}
