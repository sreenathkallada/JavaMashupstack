import java.util.Scanner;
public class QN5 {

	public static void main(String[] args) {
		// TODO factorial
		long a =1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for factorial: ");
		int number = input.nextInt();
		
		for (int i=1;i<=number;i++) {
			a= a*i;
		}
		System.out.println(a);
		input.close();

	}

}
