class StaticSample {
	static int count = 0;// will get memory only once and retain its value

	static public void change() {
		count = 6;// incrementing the value of static variable
		System.out.println(count);
	}

	public static void main(String args[]) {
//creating objects  
		StaticSample c1 = new StaticSample();
		System.out.println(count);
		StaticSample c2 = new StaticSample();
		StaticSample c3 = new StaticSample();
	}
}