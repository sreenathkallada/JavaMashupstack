import java.util.Scanner;
public class QN9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the real part of first complex number: ");
		int a = input.nextInt();
		System.out.println("Enter the img part of first complex number: ");
		int bi = input.nextInt();
		System.out.println("Enter the real part of second complex number: ");
		int c = input.nextInt();
		System.out.println("Enter the img part of second complex number: ");
		int di = input.nextInt();
		complex test = new complex(a,bi,c,di);
		test.sum();
		test.diff();
		test.product();
	}

}
class complex{
	int a,bi,c,di;
	int real;
	int img;
	
	complex(int a, int bi, int c, int di){
		this.a = a;
		this.bi=bi;
		this.c=c;
		this.di=di;
	}
	
	public void sum() {
		real = a+c;
		img = bi+di;
		System.out.println("The sum is "+real+"+"+img+"i");
	}
	public void diff() {
		real = a-c;
		img = bi-di;
		System.out.println("The difference is "+real+"-"+img+"i");
	}
	public void product() {
		real = a*c-bi*di;
		img = a*di-bi*c;
		System.out.println("The product is "+real+"+"+img+"i");
	}
	
	
}
