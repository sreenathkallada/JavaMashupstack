import java.util.Scanner;
import java.lang.Math;
public class QN12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		int power = 1;
		for (int i=1;i<=height;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print((int)Math.pow(j, i)+" ");
			}
			System.out.println();	
		}
		
		
		input.close();
	}

}
