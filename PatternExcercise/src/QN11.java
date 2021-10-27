import java.util.Scanner;
public class QN11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		int num = 1;
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(num+" ");
				num++;
			}
			int newnum = num-2;
			for(int k= 1;k<i;k++) {
				
				System.out.print(newnum+" ");
				newnum--;
			}
		
			System.out.println();
		}
		
	input.close();
	
}}