package inheritance;
class Vehicle{
	int noofwheels=0;
	void display() {
		System.out.println("The vehicle is for drivng");
		System.out.println(noofwheels);
	}
}
class Car extends Vehicle{
	void dis() {
		System.out.println("The car is for drivng");
		System.out.println(noofwheels);
	}
}
class Bike extends Vehicle{
	void display() {
		System.out.println("The Bike is for drivng");
		System.out.println(noofwheels);
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		Car c=new Car();
		c.noofwheels=4;
		c.dis();
		Bike b=new Bike();
		b.noofwheels=2;
		b.display();

	}

}
