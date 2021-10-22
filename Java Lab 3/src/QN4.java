import java.util.Scanner;
public class QN4 {

	public static void main(String[] args) {
		// TODO prime number
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to check prime or not: ");
		int number = input.nextInt();
		int x=0,y=0;
		boolean z;
		int count=0;
		
		
		if (number>1) {
				for (int i=2;i<number;i++) {
				if(number%i==0) {
					count++;
					y=i;
					continue;
				}
				
				}
				if (count==0) {
					System.out.println("The number "+number+" is a prime number");
					
				}
				else{
					System.out.println("The number "+number+" is not a prime number,it is divisible by "+y);
				}
		
				}
		else {System.out.println("Enter a number greator than 1");
		input.close();}
	}

}
