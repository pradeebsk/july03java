package inheritance;
//child class
public class Employeedetail extends Company {
	private void employeeName() {
		System.out.println("emp name is ragukumar");
		
	}
	private void employeeId() {
		System.out.println("emp id is I1");
		
	}
	public static void main(String[]args) {
		Employeedetail a=new Employeedetail();
		a.employeeName();
		a.employeeId();
		a.companyName();
		a.companyAddress();
	}

}
