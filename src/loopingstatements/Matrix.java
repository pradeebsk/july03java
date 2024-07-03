package loopingstatements;
//Nested for loop
public class Matrix {
	private void rowsAndColumns(int init,int con,int init1,int con1) {
		for(int i=init;i<=con;i++) {
		for(int j=init1;j<=con;j++) {
			System.out.println("number of shops"+j);
		}
		System.out.println("number of floors "+i);
	}

}
	public static void main(String []args) {
	Matrix m=new Matrix();
	m.rowsAndColumns(1,5,1,6);
	
}
}
