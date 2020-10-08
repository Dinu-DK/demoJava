class Test extends Thread{
	public void run() {
		System.out.println("Run");
	}
}
class testing{
public static void main(String[] args) {
	Test t = new Test();
	t.start();
	System.out.println("Main");
}
}

