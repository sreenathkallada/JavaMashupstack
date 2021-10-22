import java.util.Scanner;
public class QN2 {

	public static void main(String[] args) {
		// TODO Calculate the Power of a Number
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		System.out.print("Enter the required power : ");
		int power = input.nextInt();
		int i;
		int result =1;
		
		
		for (i = 1; i<=power;i++) {
			
			result = result * number;
		}
		input.close();
		System.out.println("The "+number+" to the power of "+power+" is "+result);
	}

}
