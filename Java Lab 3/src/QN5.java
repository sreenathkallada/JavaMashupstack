import java.util.Scanner;
public class QN5 {

	public static void main(String[] args) {
		// TODO Average usinga rrays
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no of elements you want in array: ");
		int length = input.nextInt();
		int array[]= new int[length];
		System.out.println("Enter the elements you want in array:");
		float sum =0;
		
		for(int i=0;i<length;i++) {
			array[i]= input.nextInt();
		}
		for(int j=0;j<array.length;j++) {
			sum = sum + array[j];
		}
		System.out.println("The average is "+sum/array.length);
		input.close();
	}

}
