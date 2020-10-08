import java.util.Comparator;

class AgeComparator implements Comparator<StudentDetails> {
	public int compare(StudentDetails s1, StudentDetails s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}


}