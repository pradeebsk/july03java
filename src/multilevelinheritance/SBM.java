package multilevelinheritance;

public class SBM extends SBI{
	public void amountInSBM() {
		System.out.println("amount in SBM is 27 crores");
		
	}
	public static void main(String[]args) {
		SBM a=new SBM();
		a.amountTOSBI();
		a.amountToSBM();
		a.amountInSBM();
		a.amountInRBI();
	}

}
