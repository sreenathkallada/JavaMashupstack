import java.util.Arrays;
import java.util.Scanner;
public class QN4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String first []= new String [5];
		String second []= new String [5];
		System.out.println("Enter the array elements(Limit 5)");
		for (int i = 0;i<=4;i++) {
			System.out.print("Enter the first array "+i+"th element: ");
			first[i]= input.next();
		}
		System.out.println("Enter the array elements(Limit 5)");
		for (int i = 0;i<=4;i++) {
			System.out.print("Enter the second array "+i+"th element: ");
			second[i]= input.next();
		}
//		String result []= new String [first+second];
		int length = first.length+second.length;
		String result[]= new String[length];
		int count=0;
//		String result [] =new String[length];
		for (String element : first) {
			result[count]= element;
			count++;
		}
		for (String element : second) {
			result[count]= element;
			count++;
		}
		
		System.out.println("The concatenated array is "+Arrays.toString(result));
		input.close();
	}

}
