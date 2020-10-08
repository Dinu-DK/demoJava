import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeIn8 {

	public static void main(String[] args) {
		
		LocalTime t = LocalTime.now(ZoneId.of("Asia/Kuwait"));
		System.out.println(t);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	
	}

}
