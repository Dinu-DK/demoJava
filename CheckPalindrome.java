
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aadaa";
		String b = "";
		int n = s.length();
		for (int i = n - 1; i >= 0; i--) {
			b = b + s.charAt(i);
		}
		if (s.equalsIgnoreCase(b)) {
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is not a palindrome");
		}
	}
}
