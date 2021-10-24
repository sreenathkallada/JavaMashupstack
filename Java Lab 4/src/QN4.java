import java.util.Scanner;
public class QN4 {

	public static void main(String[] args) {
		// Used type casting only
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the decimal number to round: ");
		float number = input.nextFloat();
		int numbermod = (int)number;
		System.out.print("Enter the decimal places to round :");
		int decimal = input.nextInt();
		float s = number-numbermod;
		float newdecimal=-1;
		
		for (int i=0;i<decimal;i++) {
			s = s*10;
			}
		int sum = (int)s;
		float sum1=(float)sum;
//		System.out.println(sum+ "sum");
//		System.out.println(sum1+"sum1");
		for (int i=0;i<decimal;i++) {
			
			newdecimal = sum1/10;
			sum1 = newdecimal;
			
		}
		System.out.println(numbermod+newdecimal);
		input.close();
	}

}
