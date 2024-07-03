package hierarchicalinheritance;

public class CB extends RBI {
	private void amountInCB() {
		System.out.println("amount in CB is 40 crores");
		
	}
	public static void main(String[]args) {
		CB c=new CB();
		c.amountToCB();
		c.amountInCB();
		
	}

}
