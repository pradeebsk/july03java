package interfacewithmultipleinheritance;
//child class

public class BankInfo implements Bank,Client {
	public void bankAtmPin() {
		System.out.println("bank atm pin is 2695");
		
	}
	public static void main(String []args) {
		BankInfo x=new BankInfo();
		x.bankName("SBI");
		x.bankAccNo(356252);
		x.bankAtmPin();
		x.clientName("arunkumar");
		x.clientId(2222);
		
	}
	public void bankName(String bankName) {
		System.out.println("bank name is "+bankName);
		
	}
	public void bankAccNo(int accNo) {
		System.out.println("account number is "+accNo);
		
	}
	public void clientName(String clientName) {
		System.out.println("client name is "+clientName);
		
	}
	public void clientId(int clientId) {
		System.out.println("client Id is"+clientId);
	}
	@Override
	public void bankAtmPin(int atmPin) {
		// TODO Auto-generated method stub
		
	}

}
