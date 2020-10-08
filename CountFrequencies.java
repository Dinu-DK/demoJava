
class CountFrequencies {

	void findCounts(int arr[], int n) {

		int i = 0;
		while (i < n) {

			if (arr[i] <= 0) {
				i++;
				continue;
			}
			
			int elementIndex = arr[i] - 1;
			
			if (arr[elementIndex] > 0) {
				arr[i] = arr[elementIndex];
				arr[elementIndex] = -1;
			} else {
				arr[elementIndex]--;
				arr[i] = 0;
				i++;
			}
		}

		System.out.println("Below are counts of all elements");
		for (int j = 0; j < n; j++)
			if(Math.abs(arr[j]) != 0) {
			 System.out.println(j + 1 + "->" + Math.abs(arr[j]));
			}
	}
 
	public static void main(String[] args) {
		CountFrequencies count = new CountFrequencies();
		int arr[] = {1, 3, 5, 3, 1 , 6, 4, 6};
		count.findCounts(arr, arr.length);

	}
}

// This code has been contributed by Mayank Jaiswal(mayank_24) 
