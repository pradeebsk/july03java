package loopingstatements;
//do while with for and if loop
public class Employee5 {
	private void numbers(int init,int con) {
		for (int i=init;i<=con;i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("TESTING DONE");
	}
	public static void main(String[]args) {
	Employee5 e=new Employee5();
	e.numbers(1,10);
	
	}
}
