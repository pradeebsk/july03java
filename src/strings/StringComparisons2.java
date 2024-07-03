package strings;

public class StringComparisons2 {
	public static void main(String[]args) {
		String s="Java selenium";
		String s1="Java";
		String s2="Junit";
		//equals
		boolean equals=s1.equals(s2);
		System.out.println(equals);
		//equalsIgnoreCase
		boolean ignoreCase=s.equalsIgnoreCase(s2);
		System.out.println(ignoreCase);
		//compareTo
		int compareTo =s.compareTo(s1);
		System.out.println(compareTo);
		
				
	}

}
