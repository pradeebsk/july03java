package polymorphism;
//method overloading
//using this type
public class Transport {
	
	private void employee(String name) {
		System.out.println("name is suryavarman");
		this.employee(34);
		this.employee(9962821200l);
		this.employee("sivagangai",356251247845l);
		this.employee(2254,"suryavarma@mdu");
	}
	private void employee(int age) {
		System.out.println("age is"+age);
		
	}
	private void employee(long mobile) {
	    System.out.println("mobile number is"+mobile);
	    
	}
	private void employee(String address,long accountNo) {
		System.out.println("address is "+address+"\n"+"account number is"+accountNo);
		
	}
	private void employee (int id,String mailId) {
		System.out.println("Id is "+id+"\n"+"mail Id is "+mailId);
		
	}
	public static void main (String[]args) {
		Transport s=new Transport();
		s.employee("suryavarman");
		
	}
	
	

}
