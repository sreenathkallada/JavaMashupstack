import java.util.Scanner;
public class QN6 {

	public static void main(String[] args) {
		// TODO Java Program to Find Largest Element of an Array
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int length = input.nextInt();
		int array[]=new int [length];
		System.out.println("Enter the elements you want in array:");
		int largest =-1;
		
		for (int i=0;i<length;i++) {
			
			array[i]=input.nextInt();
		}
		for (int j:array) {
//			largest =j;
			if (largest<=j) {
				largest =j;
			}
			else {
				continue;
			}
			
		}
		
		System.out.println("largest number is "+largest);
	}

}
