package JavaAl�st�rmalar;

import java.util.Scanner;

public class FaizHesaplama {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Y�ll�k Faiz Oran�n� Giriniz:");
		double yillikFaizOrani = input.nextDouble();
		
		System.out.println("Ka� y�lda �demek istiyorsunuz:");
		int yil = input.nextInt();
		
		System.out.println("Bor� alaca��n�z miktar� giriniz:");
		double borcMiktari = input.nextDouble();
		
		double aylikFaizOrani = yillikFaizOrani / 1200;
		
		double aylikOdemeMiktari = (borcMiktari * aylikFaizOrani) / (1 - (1 / Math.pow(1 + aylikFaizOrani, yil * 12)));
		
		double toplamBorc = aylikOdemeMiktari * 12 * yil;
		
		System.out.println("Ayl�k �deme miktar�: " + (int)(aylikOdemeMiktari * 100) / 100.0);
		System.out.println("Toplam �denecek miktar: " + (int)(toplamBorc * 100 ) / 100.0);
		 
		
		
	}

}
