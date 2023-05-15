package conditionalstatements;
import java.util.*;
public class EvenNumbersUptoN {
    void usingfor(int n) {
    	for(int i=1;i<=n;i++) {
    		if(i%2==0) {
    			System.out.print(i+" ");
    		}
    	}
    }
    void usingwhile(int n) {
    	int i=1;
    	while(i<=n) {
    		if(i%2==0) {
    			System.out.print(i+" ");
    		}
    		i++;
    	}
    }
    void usingdowhile(int n) {
    	int i=1;
    	do {
    		if(i%2==0) {
    			System.out.print(i+" ");
    		}
    		i++;
    	}while(i<=(n+1));
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int num=sc.nextInt();
        System.out.println("Enter any choice:\n1)for\n2)while\n3)do-while:");
        int choice=sc.nextInt();
        EvenNumbersUptoN e=new EvenNumbersUptoN();
        switch(choice) {
        case 1:
        	e.usingfor(num);
        	break;
        case 2:
        	e.usingwhile(num);
        	break;
        case 3:
        	e.usingdowhile(num);
        	break;
        }
	}

}
