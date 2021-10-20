import java.util.Scanner;
public class QN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		boolean leap;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the desired year: ");
		year = input.nextInt();
		
		if (year%400 == 0) {
			leap = true;
		}
		else if (year % 100==0) {
			leap = false;
		}
		else if (year % 4 ==0) {
			leap = true;
		}
		else {
			leap = false;
		}
		if (leap) {
			System.out.println("The year "+year+ " is a leap year");
		}
		else {
			System.out.println("The year "+year+ " is not a leap year");
		}
		input.close();
	}

}
