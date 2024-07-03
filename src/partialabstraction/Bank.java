package partialabstraction;
//abstraction
//partial abstraction
//parent class
public abstract class Bank {
	public void bankName(String bankName) {
		System.out.println("Bank name is"+bankName);
		
	}
	public void bankAccountNo(int accNo) {
		System.out.println("Bank account number is"+accNo);
		
	}
	public abstract void bankAtmPin();
	

}
