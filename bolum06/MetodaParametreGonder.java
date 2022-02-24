package Alýstýrmalar06;

public class MetodaParametreGonder {

	public static void main(String[] args) {
		
		int s1 = 5;
		int s2 = 888;
		
		System.out.println("Yerdegistir metodu cagrýlmadan once s1: " + s1 + " s2: " + s2 );
		
		yerDegistir(s1, s2);
		
		System.out.println("Yerdegistir metodu cagrýldýktan sonra s1: " + s1 + " s2: " + s2 );
	}
	
	public static void yerDegistir(int sayi1, int sayi2) {
		
		System.out.println("Yerdegistirmeden once sayi1: " + sayi1 + " sayi2: " + sayi2 );
		
		int geciciSayi = sayi1;
		sayi1 = sayi2;
		sayi2 = geciciSayi;
		
		System.out.println("Yerdegistirdikten sonra sayi1: " + sayi1 + " sayi2: " + sayi2 );
		
	}

}
