class DisplayTable extends Thread{
	public void run() {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(4 * i);
			try {
				Thread.sleep(40000000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

public class SyncTable {
	public static void main(String args[]) {
		DisplayTable obj = new DisplayTable();// only one object

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();
	}
}