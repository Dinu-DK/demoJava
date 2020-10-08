interface I {
	default void show() {
		System.out.println("in I");
	}

	static void run() {
		System.out.println("in run I");
	}

}

class J implements I {
	public void show() {
		System.out.println("in J");
	}

}

public class DefaultStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I check = new J();
		check.show();
		I.run();

	}

}
