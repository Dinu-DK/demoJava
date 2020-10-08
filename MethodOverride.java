
class Vehicle {
	// defining a method
	void run() {
		System.out.println("Vehicle is running");
	}
}

//Creating a child class  
class Bike2 extends Vehicle {
	// defining the same method as in the parent class
	void run() {
		System.out.println("Bike is running safely");
	}

}

class MethodOverride {
	public static void main(String args[]) {
		Bike2 obj1 = new Bike2();
		Vehicle obj2 = new Bike2();// creating object
		obj1.run();// calling method
		obj2.run();
	}
}