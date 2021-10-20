import java.util.Scanner;
public class QN6 {

	public static void main(String[] args) {
		// TODO Mult Table
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for respective multiplication table: ");
		int number = input.nextInt();
		
		
		for (int i=1; i<=10; i++) {
			
			System.out.println(i +" * " +number +" = " + i*number);
		}
		input.close();
	}

}
