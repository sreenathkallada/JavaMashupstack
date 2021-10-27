import java.util.Scanner;
public class QN9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height(lessthan or equal to 5): ");
		int height = input.nextInt();
		if (height<=5) {for(int i=1;i<=height*2;i=i+2) {
			for(int j=i;j<=height*2;j=j+2) {
				System.out.print(j );
			}
			for(int k=1;k<i;k=k+2) {
				System.out.print(k );
			}
			
			System.out.println();
		}}
		else {
			System.out.println("Enter number lessthan or equal to 5");
		}
		
	input.close();
	
}}