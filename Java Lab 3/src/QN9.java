import java.util.regex.*;
import java.util.Scanner;

public class QN9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = input.nextLine();
//		String str = "ssg";
		String patt = "\\s+";
		String result = "";
		Pattern whitespace = Pattern.compile(patt);
		boolean a = true;
		Matcher matcher = whitespace.matcher(str);
		if (matcher.find()) {
		    result = matcher.replaceAll("");
		}

		System.out.println(result);
		input.close();
	}

}
