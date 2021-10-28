class Triangle{
	int side1 = 3;
	int side2 = 4;
	int side3 =5;
}
public class QN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle T1 = new Triangle();
		int perimeter = (T1.side1+T1.side2+T1.side3);
		System.out.println("Perimeter is "+ perimeter);
		int sp = perimeter/2;
		int area = (int)Math.sqrt(sp*((sp-T1.side1)*(sp-T1.side2)*(sp-T1.side3)));
		System.out.print("The area is "+ area);
	}

}
