import java.util.Scanner;
public class QN8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		
		for(int i=1;i<=height;i++) {
			for(int j=i;j<=height;j++) {
				System.out.print(j);
			}
			for(int k=1;k<i;k++) {
				System.out.print(k);
			}
			
			System.out.println();
		}
		
	input.close();
	
}}