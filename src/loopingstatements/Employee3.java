package loopingstatements;
//while
public class Employee3 {
	private void descendNumbers(int init,int con) {
		int i=init;
		while(i>=con) {
			System.out.println("descend"+i);
			i--;
		}
	}
public static void main(String[]args) {
	Employee3 e=new Employee3();
	e.descendNumbers(10,1);
}
}
