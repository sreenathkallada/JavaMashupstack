import java.util.Scanner;
public class QN3 {

	public static void main(String[] args) {
		// TODO Alphabet checking

		char a;
		System.out.println(" Enter the character:");
		Scanner input = new Scanner(System.in);
		a = input.next().charAt(0);
		int ascival = (int)a;
		
		if ((ascival >= 65 && ascival <=90)||(ascival >= 97 && ascival<=122)) {
			System.out.println("The character "+a+" is an alphabet");
		}
		else {
			System.out.println("This character is not an alphabet");
		}
		input.close();
		
	}

}
