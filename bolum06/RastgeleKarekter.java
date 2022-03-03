package Alýstýrmalar06;

public class RastgeleKarekter {


	public static char RassalKarakterBul(char ch1, char ch2) {
		return (char)(Math.random() * (ch2 - ch1 + 1) + ch1);
		
	}
	
	public static char buyukHarfBul() {
		return RassalKarakterBul('A', 'Z');
		
	}
	
	public static char kucukHarfBul() {
		return RassalKarakterBul('a', 'z');
		
	}
	public static char rakamBul() {
		return RassalKarakterBul('0', '9');
		
	}public static char herhangiBirKarakterBul() {
		return RassalKarakterBul('\u0000', '\uFFFF');
		
	}



}
