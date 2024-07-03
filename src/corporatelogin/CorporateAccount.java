package corporatelogin;
import individuallogin.Newaccount;

import individuallogin.Existingaccount;
//child class
public class CorporateAccount {
	
	public void bankId () {
		System.out.println("id is I23");
		
	}
	public void userType () {
	System.out.println("user is multiusers ");
	
	}
	public static void main(String[]args) {
		
		CorporateAccount c=new CorporateAccount();
		c.bankId();
		c.userType();
		Newaccount a=new Newaccount();
		a.accountName();
		a.contactNumber();
		a.mailId();
		Existingaccount b=new Existingaccount();
		b.userName();
		b.idName();
		b.passWord();
		
	}
	

}
