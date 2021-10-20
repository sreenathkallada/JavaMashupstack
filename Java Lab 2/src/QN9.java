import java.util.Scanner;
public class QN9 {

	public static void main(String[] args) {
		// TODO Write a Java Program to Count Number of Digits in an Integer
		
		Scanner number = new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int digit = number.nextInt();
		int a =digit;
		int count = 0;
		while (digit != 0) {
			digit = digit/10;
			count++;
		}
		number.close();
		System.out.println("The number of digits in the number "+a+" is "+ count);
	}

}
