package hierarchicalinheritance;

public class IBM extends RBI {
	private void amountInIBM() {
		System.out.println("amount in IBM is 32 crores");
		
	}
	public static void main(String[] args) {
	IBM b=new IBM();
	b.amountToIBM();
	b.amountInIBM();
	}
}
	


