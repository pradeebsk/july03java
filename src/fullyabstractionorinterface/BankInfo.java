package fullyabstractionorinterface;
//child class

public  class BankInfo implements Bank{
	public void bankAtmPin() {
		System.out.println("Bank atm pin is 2695");
		
	}
	public static void main(String[]args) {
		BankInfo a=new BankInfo();
		a.bankName("SBI");
		a.bankAccNo(62732201);
		a.bankPassWord(789945);
		a.bankAtmPin();
		
	}
	public void bankName(String bankName) {
		System.out.println("Bank name is "+bankName);
		
	}
	public void bankAccNo(int bankAccNo) {
		System.out.println("Bank account number is"+bankAccNo);
		
	}
	public void bankPassWord(int bankPassWord) {
		System.out.println("Bank PassWord is"+bankPassWord);
		
	}

}
