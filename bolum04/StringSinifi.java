package Alýstýrmalar04;

public class StringSinifi {

	public static void main(String[] args) {
		String yazi = "Merhaba java!";
		
		System.out.println(yazi.length());
		System.out.println(yazi.charAt(1));
		System.out.println(yazi.charAt(12));
		System.out.println(yazi.charAt(9));
		
		String yazi2 = " cok guzel ";
		
		System.out.println(yazi + yazi2);
		
		System.out.println(yazi.toLowerCase());
		System.out.println(yazi.toUpperCase()); 
		System.out.println(yazi2.toLowerCase());
		System.out.println(yazi2.toUpperCase());
		
		String yazi3 = "       Selam Kanka          ";
		
		System.out.println(yazi3.trim());  //.trim stringde bulunan saðdaki ve soldaki boþluklarý silmede kullanýlýr.
		
		

	}

}
