
import java.util.Arrays;
import java.lang.*;
import java.util.Scanner;
public class QN6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values in the array(Max 10 values)");
		Scanner input = new Scanner(System.in);
		String value[]= new String[4];
		for (int i=0; i<4;i++) {
			System.out.print("Enter the "+(i+1)+" th value: ");
			value[i]= input.next();
		}
		System.out.print("Enter the element to check: ");
		String check = input.next();
//		System.out.println(Arrays.toString(value));
//		
//		int len = value.length;
//		for (int j=0;j<value.length;j++) {
//			
//			if (Arrays.toString(value[j])== check) {
//				System.out.print("Element "+value[j]+"found at "+j);
//				break;
//			}
//			else {
//				System.out.print("Element not found");
//			}
//		}
		boolean f=false;
		for (String s: value) {
	        if (s.equals(check)) {
//	        	System.out.println("found");
	        	f = true;
	        	break;
	        }
	        else {
	        	f= false;
	        }
	    }
		
		if (f == true) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
		
		
	}

}
