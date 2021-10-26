import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class QN8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime result = LocalDateTime.now();
//		System.out.println("The date and time is "+result);
		DateTimeFormatter formattedresult = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatresult = result.format(formattedresult);
		System.out.println("The date and time is "+ formatresult);

	}

}
