import java.util.Scanner;
public class QN5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		
		for (int i=height;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i=1;i<=height;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		input.close();

	}

}
