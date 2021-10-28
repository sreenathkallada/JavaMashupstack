class Student1{
	String name;
	int roll_no;
	int phone_number;
	String address;
	void insert(String nam,int roll,int phno,String addr) {
		name = nam;
		roll_no = roll;
		phone_number = phno;
		address = addr;
	}
	void print(){
		System.out.println(name + " having roll number- "+roll_no+" living in- "+address+". His phone number is  "+phone_number);
	}
}
public class QN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.insert("John",1,565465236,"Johny lane, Market Jn, Texas");
		s2.insert("Sam",1,457824545,"Sammy home, gb road , indiana");
		s1.print();
		s2.print();
	}

}
