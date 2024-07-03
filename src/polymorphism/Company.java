package polymorphism;
//child class
public class Company extends Client{
	private void employee(String empName) {
		
		System.out.println("employee name is ranjithkumar");
		this.employee(35);
		
	}
	private void employee (int age) {
		System.out.println("employee age is "+age);
		this.employee(9843566111l);
		
	}
	private void employee (long contactNumber) {
		System.out.println("the contact number is"+contactNumber);
		this.employee("theni",62732200035152l);
				
	}
	private void employee(String address,long accountNo) {
		System.out.println("address is "+address+"\n"+"account number is"+accountNo);
		this.employee(2215,"rk6@gmail");
		
	}
	private void employee(int id,String mailId) {
		System.out.println("id is "+id+"\n"+"mail Id is "+mailId);
		super.clientId();
		super.clientMail();
		super.clientBudget();
		
	}
	public static void main (String []args) {
		Company a=new Company();
		a.employee("ranjithkumar");
		
	}

}
