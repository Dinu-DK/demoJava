class HeyStudent {
	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable
	HeyStudent(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

//Test class to create and display the values of object  
public class StaticSamples {
	public static void main(String args[]) {
		HeyStudent.change();// calling change method
		// creating objects
		HeyStudent s1 = new HeyStudent(111, "Karan");
		HeyStudent s2 = new HeyStudent(222, "Aryan");
		HeyStudent s3 = new HeyStudent(333, "Sonoo");
		// calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}