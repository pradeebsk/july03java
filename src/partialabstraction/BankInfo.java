package partialabstraction;
//child class
public  class BankInfo extends Bank {
	public void bankAtmPin() {
		System.out.println("bank atm pin is 2356");
		
	}
	public static void main(String[]args) {
		BankInfo b=new BankInfo();
		b.bankName("CanaraBank");
		b.bankAccountNo(3562845);
		b.bankAtmPin();
	}
	

}
