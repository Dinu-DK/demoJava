import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Stream API
public class InterfaceIn8 {
	public static void main(String args[]) {
		List<Integer> values = Arrays.asList(3,6,8,1,9);
		//Stream i = values.stream();
		//i.forEach(System.out::println);
		
		values.stream().filter(i -> {
			System.out.println(i);
			return true;
		}).findFirst().orElse(0);
		
		System.out.println("hii");
		values.forEach(System.out::println);
		System.out.println("hii");
		values.stream().forEach(System.out::println);
		System.out.println("hii");
		values.parallelStream().forEach(System.out::println);
		
	}
}
