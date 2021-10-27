import java.util.Scanner;
public class QN10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		System.out.println("0");
		for(int i=height;i>=1;i--) {
			for(int j=i;j<=height;j++) {
				System.out.print(j);
			}
			System.out.print("0");
			for(int k=height;k>=i;k--) {
				System.out.print(k);
			}
			
			System.out.println();
		}
		
	input.close();
	
}}