import java.util.Scanner;
public class QN7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,## Class "Area" can't be declared, its showing its already declared, maybe in qn6
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int length = input.nextInt();
		System.out.println("Enter the breadth: ");
		int breadth = input.nextInt();
		Area1 rect1 = new Area1(length,breadth);
		
		System.out.println("The area is "+rect1.returnArea());
	}

}
class Area1{
	int l;
	int b;
	
	Area1(int length,int breadth) {
		l=length;
		b = breadth;
	}
	public int returnArea(){
		return l*b;
	}
}
