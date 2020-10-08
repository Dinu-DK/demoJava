
class StringManipulation {

	static int findSum(String str) {
		String temp = "";

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;

			} else {
				System.out.println(temp);
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		System.out.println(sum);
		System.out.println(Integer.parseInt(temp));
		return sum + Integer.parseInt(temp);
	}

	public static void main(String[] args) {

		String str = "12abc20yz68erter";

		System.out.println(findSum(str));
	}
}
