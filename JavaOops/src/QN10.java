
public class QN10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Name        Year of joining        Address");
		Employee emp1 = new Employee();
		emp1.displayDefault();
		emp1.addDetails("Robert", "1994", "64C- WallsStreat");
		emp1.displaydetails();
		Employee emp2 = new Employee();
		emp2.addDetails("Sam", "2000", "54B- WallsStreat");
		emp2.displaydetails();
		Employee emp3 = new Employee();
		emp3.addDetails("John", "1999", "28D- WallsStreat");
		emp3.displaydetails();
		
	}
}
class Employee{
	String name,year,address;
	Employee(){
		this.name = "Name";
		this.year = "Year of joining";
		this.address = "Address";
		
	}
	public void displayDefault(){
		System.out.println(this.name+ "        "+this.year+"           "+this.address);
	}
	public void addDetails(String name,String year, String address) {
		this.name = name;
		this.year =year;
		this.address = address;
		
	}
	public void displaydetails() {
//		System.out.println(this.name+ "    "+this.year+"     "+this.address);
		System.out.println(name+ "            "+year+"               "+address);
	}
	
}
//.addDetails("Robert", "1994", "64C- WallsStreat");
//.addDetails("Sam", "2000", "54B- WallsStreat")
//.addDetails("John", "1999", "28D- WallsStreat")