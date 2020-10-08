
interface Parser {
	public String parse(String s);
}

class StringConverter {
	public static String convert(String s) {
		return s + " is a Boss";
	}
}

public class MethodReferenceIn8 {
	public static void main(String[] args) {
		//StringConverter sc = new StringConverter();
		Parser p = StringConverter::convert;
		System.out.println(p.parse("Bryant"));
	}
}
