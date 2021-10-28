class Rectangle{
	int b,h;
		Rectangle(int breadth, int height){
		b=breadth;
		h =height;
	}
	public int area() {
		
		return b*h;
}
}

public class QN5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle one = new Rectangle(4,5);
		Rectangle two = new Rectangle(5,8);
		System.out.println("The area of first is "+one.area());
		System.out.println("The area of second is "+two.area());
		
	}

}
