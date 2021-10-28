import java.util.Scanner;
public class QN8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = input.nextInt();
		Average newAvg = new Average();
		newAvg.calculate(num1, num2, num3);
		newAvg.print();
	}

}
class Average{
	float num1,num2,num3;
	float result;
	public void calculate(float num1,float num2,float num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.result =(num1+num2+num3)/3;
		System.out.println("Average calculated..");
		
	}
	public void print(){
		System.out.println("The average of "+num1+","+num2+","+num3+ " is "+result);
	}
	
}