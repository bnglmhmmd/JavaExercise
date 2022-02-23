package Alýstýrmalar04;

public class SubString {

	public static void main(String[] args) {

		String str1 = "Merhaba java";
		System.out.println(str1.substring(5));

		String str2 = str1.substring(5, 9);
		System.out.println(str2);

		String str3 = str1.replace("haba", "adem");
		System.out.println(str3);

		String str4 = str1.substring(0, 7) + " HTML";
		System.out.println(str4);

		System.out.println(str1.indexOf('j'));
		System.out.println(str1.indexOf('a', 5));

	}

}
