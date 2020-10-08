abstract class printable {
	abstract void print();
}

class InterfaceSample extends printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		printable obj = new InterfaceSample();
		obj.print();
	}
}