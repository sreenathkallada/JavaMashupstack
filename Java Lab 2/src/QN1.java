import java.util.Scanner;
public class QN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ,y ,z;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		x = input.nextInt();
		System.out.println("Enter the second number: ");
		y = input.nextInt();
		System.out.println("Enter the third number: ");
		z = input.nextInt();
		
		if (x>y && x>z) {
			System.out.println("The largest number is "+x);
		}
		else if(y>z) {
			System.out.println("The largest number is "+y);
		}
		else {
			System.out.println("The largest number is "+z);
		}
		input.close();
		
	}
}
