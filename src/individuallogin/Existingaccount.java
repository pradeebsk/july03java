package individuallogin;

public class Existingaccount {
	public void idName() {
	   System.out.println("id name is roy");
	   
	}
	public void userName() {
		System.out.println("user name is ragupathi roy");
		
	}
	public void passWord() {
		System.out.println("password is 584256 ");
		
	}
	public static void main(String[]args) {
		Existingaccount b=new Existingaccount();
		b.idName();
		b.userName();
		b.passWord();
		Newaccount a=new Newaccount();
		a.accountName();
		a.contactNumber();
		a.mailId();
		
	}

}
