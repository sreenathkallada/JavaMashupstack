import java.util.Scanner;
public class QN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array length: ");
		int length = input.nextInt();
		System.out.print("Enter the array elements: ");
		int [] array= new int[length];
		for (int i=0;i<length;i++){
			array[i]= input.nextInt();
			
		}
		for (int i=0;i<length;i++){
			System.out.print(array[i]+" ");
			
		}
		
	}

}
