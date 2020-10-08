class Bike {
	void run() {
		System.out.println("running");
	}
}

class SuperSample extends Bike {
	void run() {
		super.run();
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Bike b = new SuperSample();// upcasting
		b.run();
	}
}