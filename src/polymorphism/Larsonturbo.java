package polymorphism;
//method overloading
public class Larsonturbo {
	private void employee (String empName) 
	{
		System.out.println("employee name is "+empName);
		
	}
	private void employee (int age) {
		System.out.println("age is "+age);
		
	}
	private void employee (long mobile) {
		System.out.println("mobile number is "+mobile);
		
	}
	private void employee (String address,long accNo) {
		System.out.println("address is"+address+"\n"+"account number is"+accNo);
		
	}
	private void employee (int id,String mailId) {
		System.out.println("the ID is"+id+"\n"+"mail id is "+mailId);
		
	}
	public static void main(String[]args) {
		Larsonturbo a=new Larsonturbo();
		a.employee("sankar");
		a.employee(24);
		a.employee(9751081612l);
		a.employee("sivagangai",62732200035452l);
		a.employee(2266,"kpms@siva");
		
		a.employee("rahul");
		a.employee(22);
		a.employee(9500778772l);
		a.employee("madurai",62732255526458l);
		a.employee(3251, "rahulsmart@23");
		
		a.employee("kumaran");
		a.employee(35);
		a.employee(9843566111l);
		a.employee("salem", 983491635125353l);
		a.employee(6234, "kumara@vel");
		
	}
		
	
	

}
