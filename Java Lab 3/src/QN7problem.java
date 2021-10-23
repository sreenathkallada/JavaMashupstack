import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class QN7problem {

	public static void main(String[] args) {
		// TODO Program to Calculate Difference Between Two Time Periods
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first time(HH:MM:SS): ");
		String time1 = input.next();
//		String a = time1;
		System.out.print("Enter the second time(HH:MM:SS): ");
		String time2 = input.next();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime format2 = time1.format(format);
		
		
		
	}

}
