import java.util.Scanner;
public class QN6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int length = input.nextInt();
		System.out.println("Enter the breadth: ");
		int breadth = input.nextInt();
		Area rect1 = new Area();
		rect1.setDim(length, breadth);
		System.out.println("The area is "+rect1.getArea());
	}

}
class Area{
	int l;
	int b;
	
	public void setDim(int length,int breadth) {
		l=length;
		b = breadth;
	}
	public int getArea(){
		return l*b;
	}
}
