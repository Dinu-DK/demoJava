import java.util.ArrayList;
import java.util.Collections;

class SortingStudents {
	public static void main(String args[]) {
//Creating a list of students  
		ArrayList<StudentDetails> al = new ArrayList<>();
		al.add(new StudentDetails(101, "Vijay", 23));
		al.add(new StudentDetails(106, "Ajay", 27));
		al.add(new StudentDetails(105, "Jai", 21));

		System.out.println("Sorting by Name");
//Using NameComparator to sort the elements  
		Collections.sort(al, new NameComparator());
//Traversing the elements of list  
		for (StudentDetails st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by Age");
//Using AgeComparator to sort the elements  
		Collections.sort(al, new AgeComparator());
//Travering the list again  
		for (StudentDetails st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}