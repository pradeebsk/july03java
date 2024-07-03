package conditionalstatements;
//control statements
public class Employee {
	private void voteEligibility(int age) {
		if (age>18) {
		System.out.println("eligible to vote");
		
	}
	else {
		System.out.println("not eligible to vote");
	}
	

}
private void bloodDonation(int age,int weight) {
	if(age>18&&weight>50) {
		System.out.println("eligible to donate blood");
		
	}
	else{
		System.out.println("not eligible to donate blood");	
	}
		
		
}
private void gymJoining(int age ,int weight) {
	if (age>18||weight>50) {
		System.out.println("eligible to join");
		
	}
	else {
		System.out.println("not eligible to join");
		
	}
		
}
private void tallestBoy(int ajay ,int ram,int surya) {
	if(ajay>ram && ajay>surya ) {
		System.out.println("ajay is tallest");
	}
	else if(ram>ajay && ram> surya) {
		System.out.println("ram is tallest");
	}
	else if(surya>ajay && surya>ram) {
		System.out.println("surya is tallest");
	}
	else {
		System.out.println("All are Equal");
	}
	
}
private void daySelection(int day) {
	switch(day) {
	case 1:{
		System.out.println("Day is Sunday");
		break;
	}
	case 2:{
		System.out.println("Day is Monday");
		break;
	}
	case 3:{
		System.out.println("Day is Tuesday");
		break;
	}
	case 4:{
		System.out.println("Day is Wednesday");
		break;
	}
	case 5:{
		System.out.println("Day is Thursday");
		break;
	}
	case 6:{
		System.out.println("Day is Friday");
		break;
	}
	case 7:{
		System.out.println("Day is Saturday");
		break;
	}
	default:{
		System.out.println("Match not Found ");
	}
	}
}
public static void main(String[]args) {
	Employee e=new Employee();
	e.voteEligibility(25);
	e.bloodDonation(25,58);
	e.gymJoining(17,67);
	e.tallestBoy(47,52,30);
	e.daySelection(3);
}
}