package week2.day4;

public class Employe {
	public void employename(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);

	}
	public void employeid(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);

	}
public void employesalary(double salary) {
	// TODO Auto-generated method stub
	System.out.println(salary);

}
public void employeaddress(String address) {
	// TODO Auto-generated method stub
	System.out.println(address);

}
public void employemobilenumber(long mobilenumber) {
	// TODO Auto-generated method stub
System.out.println(mobilenumber);
}
public static void main(String[] args) {
	Employe emp=new Employe();
	emp.employename("abinesh");
	emp.employeid(4125);
	emp.employesalary(25000);
	emp.employeaddress("tambaram");
	emp.employemobilenumber(9944120802l);
	
}
}
