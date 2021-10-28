class Student{
	String name;
	int roll_no;
	void insert(int roll,String nam) {
		name = nam;
		roll_no = roll;
	}
	void print(){
		System.out.print("Roll no is "+roll_no+ " and name is "+name);
	}
}
public class QN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.insert(2,"John");
//		s1.print();
	}

}
