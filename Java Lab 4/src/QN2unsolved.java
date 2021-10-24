import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class QN2unsolved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the date: ");
		String dateData = input.next();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd mm yyyy");
		LocalDate date = LocalDate.parse(dateData,format);
		System.out.println(date);
		
		
	}

}
