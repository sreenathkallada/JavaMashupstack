import java.util.Scanner;
public class QN8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height of pyramid: ");
		int height = input.nextInt();
		
		for (int i=0;i<height;i++ ) {

//			
			for(int k=0;k<height-1-i;k++) {
				System.out.print(" ");
				
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
			
		}
		input.close();

	}

}
