package loopingstatements;
//do while for and if statements
public class Employee6 {
	private void numbers(int init,int con) {
		for(int i=init;i>=con;i--) {
			if (i==4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Testing Done");
	}
	public static void main(String[]args) {
		Employee6 e=new Employee6();
		e.numbers(10,1);
	}

}
