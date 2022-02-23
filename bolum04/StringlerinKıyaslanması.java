package Alýstýrmalar04;

public class StringlerinKýyaslanmasý {

	public static void main(String[] args) {
		
		String s1 = "Merhaba java";
		String s2 = "   MerHAba java   ";
		
		boolean b = s1.equalsIgnoreCase(s2.trim());
		
		if(b) {
			System.out.println("s1 eþittir s2");
		}else {
			System.out.println("s1 s2 ye eþit degildir.");
		}

		
		s1 = "java";
		s2 = "JAVA";
		int kýyaslamaDegeri = s1.compareTo(s2);
		
		if(kýyaslamaDegeri == 0) {
			System.out.println(s1 + " esittir " + s2 + " ya");
		}else if(kýyaslamaDegeri > 0) {
			System.out.println(s1 + " buyuktur " + s2 + " den" );
		}else{
			System.out.println(s1 + " kucuktur " + s2 + "den" );
		}
		
		
		
		System.out.println("Welcome to java".startsWith("We"));
		System.out.println("Welcome to java".startsWith("we"));
		System.out.println("Welcome to java".endsWith("va"));
		System.out.println("Welcome to java".endsWith("ve"));
		System.out.println("Welcome to java".contains("to"));
		System.out.println("Welcome to java".contains("To"));
		
	}

}



/*
 * equals(s1) =  Returns true if this string is equal to string s1.
 * equalsIgnoreCase(s1) = Returns true if this string is equal to string s1; it is case insensitive.
 * compareTo(s1) = Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1. 
 * compareToIgnoreCase(s1) =  Same as compareTo except that the comparison is case insensitive.
 * startsWith(prefix) = Returns true if this string starts with the specified prefix.
 * endsWith(suffix) Returns true if this string ends with the specified suffix. 
 
 contains(s1) Returns true if s1 is a substring in this string.
 */
 
 
 
 
 


