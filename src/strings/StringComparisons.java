package strings;

public class StringComparisons {
	public static void main (String []args) {
		String s="Java selenium";
		String s1="";
		//charAt();
		char charAt=s.charAt(1);
		System.out.println(charAt);
		//IndexOf
		int indexOf=s.indexOf('a');
		System.out.println(indexOf);
		//lastIndexOf
		int lastIndexOf=s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		//to upper case
		String UpperCase=s.toUpperCase();
		System.out.println(UpperCase);
		//toLowerCase
		String LowerCase=s.toLowerCase();
		System.out.println(LowerCase);
		//isEmpty
		boolean empty=s.isEmpty();
		System.out.println(empty);
		boolean empty1=s1.isEmpty();
		System.out.println(empty1);
		//startsWith
		boolean startsWith=s.startsWith("ja");
	    System.out.println(startsWith);
	    //endsWith
	    boolean endsWith=s.endsWith("um");
	    System.out.println(endsWith);
	    //contains
	    boolean contains=s.contains("@");
	    System.out.println(contains);
	    
	    
		
		
	}

}
