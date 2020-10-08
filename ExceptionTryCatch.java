import java.io.IOException;

class Check {
	void m() {
		try {
			float x = 30/0;
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is executed");
		}
	}
}

public class ExceptionTryCatch {
	public static void main(String[] args) {
		Check er = new Check();
		er.m();
		//System.out.println(er.m());
	}
}