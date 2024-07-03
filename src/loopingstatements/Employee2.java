package loopingstatements;
//while loop
public class Employee2 {
	private void numbers(int init,int con) {
		int i=init;
		while(i<=con) {
			System.out.println("start"+i);
		    i++	;
		}
		}
	public static void main(String[]args) {
		Employee2 e=new Employee2();
		e.numbers(1,15);
	}

}
