
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class ArraySorting {
	public void mergeArray() {
		char[] arr1 = { 'X', 'A', 'R', 'E', 'W' };
		char[] arr2 = { 'L', 'T', 'S', 'A', 'E', 'X' };
		char[] mergeArr = new char[arr1.length + arr2.length];
	    System.arraycopy(arr1, 0, mergeArr, 0, arr1.length);
	    System.arraycopy(arr2, 0, mergeArr, arr1.length, arr2.length);
	    
		Set<String> removeDup = new TreeSet<>();
		for (int i = 0; i < mergeArr.length; i++) {
			removeDup.add(Character.toString(mergeArr[i]));
		}

		System.out.println("x. Array :"+Arrays.toString(arr1));
		System.out.println("Array 2 :"+Arrays.toString(arr2));
		System.out.println("Output :"+removeDup.toString());
	}
}

public class HelloWorld {
	public static void main(String args[]) {
		ArraySorting arrSort = new ArraySorting();
		arrSort.mergeArray();
	}
}