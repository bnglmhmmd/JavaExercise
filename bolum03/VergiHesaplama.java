package bolum3Alýstýrmalar;

import java.util.*;

public class VergiHesaplama {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		System.out.println("Lütfen gelirinizi giriniz:");
		
		double gelir = giris.nextDouble();
		double vergi = 0;
		
		if(gelir <= 12600) {
			vergi = gelir * 0.15;
			System.out.println();
		}else if(gelir <= 30000){
			vergi = 12600 * 0.15 + (gelir - 12600) * 0.20;
		}else if(gelir <= 69000){
			vergi = 12600 * 0.15 + (30000 - 12600) * 0.2 + (gelir - 30000) * 0.25;
			
		}else {
			vergi = 12600 * 0.15 + (30000 - 12600) * 0.2 + (69000 - 30000) * 0.25 + (gelir - 69000) * 0.35;
		}
		System.out.println("Ödeyeceðiniz yýllýk vergi miktarý:" + vergi);
		giris.close();
		
	}

}
