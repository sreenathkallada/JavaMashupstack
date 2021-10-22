import java.util.Scanner;
public class QN3 {

	public static void main(String[] args) {
		// TODO Program to Check Whether a Number is Palindrome or Not
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to check for palindrome: ");
		int number = input.nextInt();
		int a=number,n , sum=0;
		
		while(number>0) {
			
			n=number%10;
			sum = sum*10+n;
			number = number/10;
			
		}
		
		if (sum == a) {
			
			System.out.print("The number "+a+" is a palindrome.");
		}
		else {
			System.out.print("The number "+a+" is not a palindrome.");
		}
		input.close();
	}

}
