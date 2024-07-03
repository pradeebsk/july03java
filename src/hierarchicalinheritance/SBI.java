package hierarchicalinheritance;

public class SBI extends RBI {
	private void amountInSBI() {
		System.out.println("amount in SBI is 20 crores");
		
	}
	public static void main (String[]args) {
		SBI a=new SBI();
		a.amountToSBI();
		a.amountInSBI();
		
	}

}
