class FinalizeSample {
	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		FinalizeSample f1 = new FinalizeSample();
		FinalizeSample f2 = new FinalizeSample();
		f1 = null;
		f2 = null;
		System.gc();
		f1.finalize();
	}
}