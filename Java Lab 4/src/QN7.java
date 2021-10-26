import java.util.Scanner;
public class QN7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter the string: ");
		String toCheck = input.nextLine();
		System.out.println("The string is "+ isNullEmpty(toCheck));
		
		
		
	}
		 public static String isNullEmpty(String str){
			if (str==null) {
				return "null";
			}
			else if(str.isEmpty()){
				return "empty";
			}
			else {
				return "not empty";
			}
			
		}
	}


