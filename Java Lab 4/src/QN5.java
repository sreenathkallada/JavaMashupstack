import java.util.Arrays;
import java.util.Scanner;
public class QN5 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the operwtion(1 for ChartoString and 2 for Stringtochar): ");
	try{
	int operation = input.nextInt();
	
		if(operation ==2) {
			System.out.print("Enter the string to convert: ");
			String string = input.next();
			char[] toChar = string.toCharArray();
			for (int i=0; i<toChar.length;i++) {
				System.out.print(toChar[i]);
			}
//			System.out.println(Arrays.toString(toChar));
		}
		else if(operation ==1) {
			System.out.print("Enter the char to convert: ");
			char[] toString= new char[10];
			for(int i=0;i<10;i++){
				toString[i]= input.next().charAt(0);
			}
			String str1 = String.valueOf(toString);
			String str11 = new String(str1);
			
			System.out.print("Char to string is " +str11);
		}
		else {
				System.out.print("Enter a valid operation(1/2)");
		}
	}
	catch(Exception e){
		System.out.println("Something went wrong, pls check inputs" +e);
	}
		
	}

}
