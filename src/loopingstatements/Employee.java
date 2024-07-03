package loopingstatements;
//for loop
public class Employee {
	private void numbers(int init,int con) {
		for (int i=init;i<=con;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[]args) {
		Employee e= new Employee();
		e.numbers(1,10);
	}

}
