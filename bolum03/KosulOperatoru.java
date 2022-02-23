package bolum3Alýstýrmalar;

import java.util.Scanner;

public class KosulOperatoru {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("LÜtfen yasýnýzý giriniz:");
		
		int yas = klavye.nextInt();
		int biletFiyati = 0;
		
		biletFiyati = (yas >= 16) ? 20 : 10;
		System.out.println("Biletinizin fiyati: " + biletFiyati);
		System.out.println("-------------------------------------");
	
		
		System.out.println("Olcek degerini giriniz:");
		int olcek = klavye.nextInt();
		
		int skor = 0;
		int x = 0;
		
		skor = (x > 10) ? 3 * olcek : 4 * olcek; 
		System.out.println("Skorunuz: " + skor );
		System.out.println("----------------------------");
		
		
		System.out.println("Lütfen gelirinizi giriniz:");
		int gelir = klavye.nextInt();
		double vergi;
		
		vergi = (gelir >= 10000) ? gelir * 0.2 : gelir * 0.17 + 1000;
		System.out.println("Yýllýk verginiz: " + vergi);		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
