import java.util.Scanner;
public class QN4 {

	public static void main(String[] args) {
		// TODO Sum of natural numbers
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length to which sum is to be calculated");
		int length = input.nextInt();
		
		
		System.out.println("The sum upto "+length+" natural numbers is "+(length*(length+1))/2);
		input.close();
	}

}
