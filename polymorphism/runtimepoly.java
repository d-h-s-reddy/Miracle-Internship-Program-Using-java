package polymorphism;
class Bank{
	int rateofinterest(){
		return 0;
	}
}
class Sbi extends Bank{
	int rateofinterest(){
		return 5;
	}
}
class Hdfc extends Bank{
	int rateofinterest(){
		return 10;
	}
}
public class runtimepoly {

	public static void main(String[] args) {
		Sbi b=new Sbi();
		System.out.print(b.rateofinterest());

	}

}
