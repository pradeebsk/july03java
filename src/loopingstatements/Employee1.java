package loopingstatements;
//for loop
public class Employee1 {
	private void numbers(int init,int con) {
		for(int i=init;i>=con;i--) {
			System.out.println(i);
		}
	}
	public static void main(String[]args) {
		Employee1 e= new Employee1();
		e.numbers(15, 1);
	}

}
