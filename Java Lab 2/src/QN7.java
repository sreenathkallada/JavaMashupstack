import java.util.Scanner;
public class QN7 {

	public static void main(String[] args) {
		// TODO Fibo seq
			
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the limit for fibonacci sequence: ");
		int number = input.nextInt();
		int a= 0;
		int b= 1;
		int temp;
		
		if (number ==2) {
			System.out.println(0);
			System.out.println(1);
		}
		else if (number<2) {
			System.out.println("Error! Enter a number greator than 1");
		}
		
		else {
			System.out.println(0);
			System.out.println(1);
			for (int i=1;i<=number-2;i++) {
				temp = a+ b;
				a=b;
				b=temp;
				System.out.println(temp);
			
		}
		
		
		}
		System.out.println("End of series");
		
		input.close();
	}

}
