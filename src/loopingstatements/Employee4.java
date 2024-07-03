package loopingstatements;
//do while
public class Employee4 {
	private void numbers(int init,int con) {
		int i=init;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=con);
	}
	public static void main(String[]args) {
		Employee4 e=new Employee4();
		e.numbers(1,0);
	}

}
