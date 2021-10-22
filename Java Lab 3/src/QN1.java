import java.util.Scanner;
import java.lang.Math;
public class QN1 {

	public static void main(String[] args) {
		// TODO Java Program to Reverse a Number
		
		Scanner number = new Scanner(System.in);
		System.out.print("Enter the number to reverse: ");
		int num = number.nextInt();
		int a = num;
		int count = 1;
		String b ="";
		while(num>=1) {
			double digit = a%(Math.pow(10, count));
			
			String digstr = String.valueOf(digit);
			b = b+digstr.charAt(0);
			
			//System.out.print(digstr.charAt(0));
			count++;
			num=num/10;
			
		}
		number.close();
		
		System.out.println("The reverse order is "+b);
	}

}
