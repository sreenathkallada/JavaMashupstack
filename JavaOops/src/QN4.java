class Triangleqn5{
	int s1,s2,s3;
	public Triangleqn5(int side1, int side2,int side3)
	{
		s1 =side1;
		s2= side2;
		s3=side3;
	}
}
public class QN4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangleqn5 T1 = new Triangleqn5(3,4,5);
		int perimeter = (T1.s1+T1.s2+T1.s3);
		System.out.println("Perimeter is "+ perimeter);
		int sp = perimeter/2;
		int area = (int)Math.sqrt(sp*((sp-T1.s1)*(sp-T1.s2)*(sp-T1.s3)));
		System.out.print("The area is "+ area);
	}

}
